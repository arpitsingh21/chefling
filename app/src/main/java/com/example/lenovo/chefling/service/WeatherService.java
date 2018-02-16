package com.example.lenovo.chefling.service;

import com.example.lenovo.chefling.Response.WeatherResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 16/2/18.
 */

public class WeatherService {


        private static String BASE_URL =  "https://query.yahooapis.com/";

        public interface  CountryAPI{
            @GET("v1/public/yql")
            Call<WeatherResponse> getResults(@Query("q") String q, @Query("format") String format, @Query("env") String env);
        }

        public CountryAPI getAPI(){
            Retrofit retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(CountryAPI.class);
        }

}
