package com.example.lenovo.chefling.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 16/2/18.
 */

public class Astrology {

    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
