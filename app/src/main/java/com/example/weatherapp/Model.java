package com.example.weatherapp;

import com.google.gson.annotations.SerializedName;


public class Model {

        @SerializedName("location")
   private location location;
        @SerializedName("current")
    private current current;

    public Model(com.example.weatherapp.location location, com.example.weatherapp.current current) {
        this.location = location;
        this.current = current;
    }

    public com.example.weatherapp.location getLocation() {
        return location;
    }

    public void setLocation(com.example.weatherapp.location location) {
        this.location = location;
    }

    public com.example.weatherapp.current getCurrent() {
        return current;
    }

    public void setCurrent(com.example.weatherapp.current current) {
        this.current = current;
    }
}
