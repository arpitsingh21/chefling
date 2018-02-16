package com.example.lenovo.chefling.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 16/2/18.
 */

public class Item {

    @SerializedName("forecast")
    private List<Forecast> item;

    public List<Forecast> getItem() {
        return item;
    }

    public void setItem(List<Forecast> item) {
        this.item = item;
    }
}
