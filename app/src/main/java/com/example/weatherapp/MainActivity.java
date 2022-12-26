package com.example.weatherapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    String apiurl = "http://api.weatherapi.com/";
    TextView temp_c, type, location, region, country, timezone, time;
    ImageView wimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        temp_c = findViewById(R.id.temp_c_id);
        type = findViewById(R.id.type_id);
        location = findViewById(R.id.location_id);
        region = findViewById(R.id.region_id);
        country = findViewById(R.id.country_id);
        time = findViewById(R.id.time_id);
        timezone = findViewById(R.id.timezone_id);
        wimage = findViewById(R.id.weather_change_image_id);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WApi wAp = retrofit.create(WApi.class);
        Call<Model> call = wAp.getalldata();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                Model model = response.body();
                try {
                    location.setText((model.getLocation().getName()));
                    region.setText(model.getLocation().getRegion());
                    country.setText(model.getLocation().getCountry());
                    timezone.setText(model.getLocation().getTz_id());
                    time.setText(model.getLocation().getLocaltime());
                    temp_c.setText(model.getCurrent().getTemp_c() + "\u2103");
                    type.setText(model.getCurrent().getCondition().getText());
                    String nirav = model.getCurrent().getCondition().getIcon();
                    Picasso.get().load(nirav).into(wimage);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                t.printStackTrace();
            }
        });


    }
}