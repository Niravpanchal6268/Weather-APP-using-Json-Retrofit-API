package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WApi {
    @GET("v1/current.json?key=824f90799cf94a978f7124613222312&q=Gujarat&aqi=yes")
    Call<Model> getalldata();

}
