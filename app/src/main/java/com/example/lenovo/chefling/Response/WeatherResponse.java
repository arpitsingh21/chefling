package com.example.lenovo.chefling.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 16/2/18.
 */

public class WeatherResponse {


    @SerializedName("query")
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
