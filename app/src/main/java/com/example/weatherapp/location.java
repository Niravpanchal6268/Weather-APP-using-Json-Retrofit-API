package com.example.weatherapp;

public class location {


    private String name,region,country,tz_id,localtime;

    public location(String name, String region, String country, String tz_id, String localtime) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.tz_id = tz_id;
        this.localtime = localtime;
    }

    public location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTz_id() {
        return tz_id;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}
