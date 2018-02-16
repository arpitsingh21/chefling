package com.example.lenovo.chefling.presenter;

import android.content.Context;
import android.util.Log;

import com.example.lenovo.chefling.Constants;
import com.example.lenovo.chefling.Response.WeatherResponse;
import com.example.lenovo.chefling.model.WeatherModel;
import com.example.lenovo.chefling.service.WeatherService;
import com.example.lenovo.chefling.view.WeatherView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by lenovo on 16/2/18.
 */

public class WeatherPresenter {
WeatherView weatherView;
WeatherService weatherService;

    public WeatherPresenter( WeatherView view){
        this.weatherView = view;
        this.weatherService = new WeatherService();
    }

    public void getWeather() {
        weatherService
                .getAPI()
                .getResults(Constants.query,"json",Constants.env)
                .enqueue(new Callback<WeatherResponse>() {
                    @Override
                    public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {



                        if (response!=null) {

                            WeatherResponse result = response.body();

                            Log.d("response","response not null"+response.raw());

                            if (result!=null) {
                                List<WeatherModel> list = new ArrayList<>();
                               int size = result.getQuery().getResult().getChannel().getItem().getItem().size();
                                Log.d("Result",result.getQuery().getResult().getChannel().getItem().toString());





                                for (int i = 0; i < size; i++) {

                                    WeatherModel weatherModel = new WeatherModel();
                                    weatherModel.setDate(result.getQuery().getResult().getChannel().getItem().getItem().get(i).getDate());
                                    weatherModel.setHigh(result.getQuery().getResult().getChannel().getItem().getItem().get(i).getHigh());
                                    weatherModel.setLow(result.getQuery().getResult().getChannel().getItem().getItem().get(i).getLow());
                                    weatherModel.setSunrise(result.getQuery().getResult().getChannel().getAstrology().getSunrise());
                                    weatherModel.setSunset(result.getQuery().getResult().getChannel().getAstrology().getSunset());

                                    list.add(weatherModel);
                                }


                                weatherView.showWeatherList(list);

                            }
                            else {

                                Log.d("Error","result null");
                            }
                        }

                        else
                        {

                            Log.d("Error","Response null");
                        }
                    }

                    @Override
                    public void onFailure(Call<WeatherResponse> call, Throwable t) {
                        try {
                            throw  new InterruptedException("Erro na comunicação com o servidor!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
