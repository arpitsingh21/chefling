package com.example.lenovo.chefling;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.chefling.model.WeatherModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 16/2/18.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{


        private List<WeatherModel> weatherModelArrayList = new ArrayList<>();
        private Context mContext;

        public WeatherAdapter(Context context, List<WeatherModel> weatherModels) {
            mContext = context;
            weatherModelArrayList = weatherModels;
        }

        @Override
        public WeatherAdapter.WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_weather, parent, false);
            WeatherViewHolder viewHolder = new WeatherViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(WeatherAdapter.WeatherViewHolder holder, int position) {
            holder.bindRestaurant(weatherModelArrayList.get(position));
        }

        @Override
        public int getItemCount() {
            return weatherModelArrayList.size();
        }

        public class WeatherViewHolder extends RecyclerView.ViewHolder {



            TextView sunrise,sunset,date,low,high;

            private Context mContext;

            public WeatherViewHolder(View itemView) {
                super(itemView);

                sunrise= (TextView)itemView.findViewById(R.id.sunrise);
                sunset= (TextView)itemView.findViewById(R.id.sunset);
                low= (TextView)itemView.findViewById(R.id.low);
                high= (TextView)itemView.findViewById(R.id.high);
                date= (TextView)itemView.findViewById(R.id.date);
                mContext = itemView.getContext();
            }

            public void bindRestaurant(WeatherModel model) {
                sunset.setText(model.getSunset());
                sunrise.setText(model.getSunrise());
                low.setText(model.getLow());
                high.setText(model.getHigh());
                date.setText(model.getDate());
            }
        }
    }

