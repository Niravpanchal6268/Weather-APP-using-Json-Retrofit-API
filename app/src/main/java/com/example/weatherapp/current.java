package com.example.weatherapp;

public class current {
    /*  "last_updated_epoch": 1671799500,
    "last_updated": "2022-12-23 12:45",
    "temp_c": 11.0,
    "temp_f": 51.8,
    "is_day": 1,
    "condition": {
      "text": "Partly cloudy",
      "icon": "//cdn.weatherapi.com/weather/64x64/day/116.png",
      "code": 1003*/

    private String temp_c;
    private  condition condition;

    public current(String temp_c, com.example.weatherapp.condition condition) {
        this.temp_c = temp_c;
        this.condition = condition;
    }

    public String getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(String temp_c) {
        this.temp_c = temp_c;
    }

    public com.example.weatherapp.condition getCondition() {
        return condition;
    }

    public void setCondition(com.example.weatherapp.condition condition) {
        this.condition = condition;
    }
}
