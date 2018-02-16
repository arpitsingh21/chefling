package com.example.lenovo.chefling.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 16/2/18.
 */

public class Query {

    @SerializedName("results")
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
