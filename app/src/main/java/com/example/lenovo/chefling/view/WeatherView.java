package com.example.lenovo.chefling.view;

import com.example.lenovo.chefling.model.WeatherModel;

import java.util.List;

/**
 * Created by lenovo on 16/2/18.
 */

public interface WeatherView {

    void showWeatherList(List<WeatherModel> weatherModels);
}
