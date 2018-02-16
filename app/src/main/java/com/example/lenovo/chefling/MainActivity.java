package com.example.lenovo.chefling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.chefling.model.WeatherModel;
import com.example.lenovo.chefling.presenter.WeatherPresenter;
import com.example.lenovo.chefling.view.WeatherView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements WeatherView {

    WeatherPresenter weatherPresenter;
    RecyclerView recyclerView;

    WeatherAdapter weatherAdapter;

    List<WeatherModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list= new ArrayList<>();


        weatherPresenter = new WeatherPresenter(this);
        weatherPresenter.getWeather();



    }

    @Override
    public void showWeatherList(List<WeatherModel> weatherModels) {

        list=weatherModels;
        weatherAdapter = new WeatherAdapter(this, list);
        recyclerView.setAdapter(weatherAdapter);



    }
}
