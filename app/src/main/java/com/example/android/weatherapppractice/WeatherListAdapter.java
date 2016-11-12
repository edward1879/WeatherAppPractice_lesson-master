package com.example.android.weatherapppractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 5/11/2016.
 */
public class WeatherListAdapter extends BaseAdapter {
    private ArrayList<Weather> weatherArrayList;
    private Context context;

    public WeatherListAdapter(ArrayList<Weather> weatherArrayList, Context context) {
        this.weatherArrayList = weatherArrayList;
        this.context = context;
    }

    /** return the number of item in the arraylist */
    @Override
    public int getCount() {
        return weatherArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return weatherArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /** return the layout of a cell
     * use a ViewHolder to hold the views to increase the performance of the listView
     * LayoutInflater: inflate the cell layout to the view object
     * findViewById from the view object and bind them to the corresponding views in the ViewHolder
     *
     * then set text and image to the corresponding views
     * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_weather_item, parent,false);
        ImageView weatherIcon = (ImageView) convertView.findViewById(R.id.iv_weatherImage);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tv_date);
        TextView tvAverageTemp = (TextView) convertView.findViewById(R.id.tv_averageTemp);
        TextView tvWeatherDescription = (TextView) convertView.findViewById(R.id.tv_weatherDescription);

        Weather weather = weatherArrayList.get(position);
        tvDate.setText(weather.getDate());
        tvAverageTemp.setText(weather.getAverageTemp());
        tvWeatherDescription.setText(weather.getWeatherDescription());
        //weatherIcon.setImageDrawable(weather.get);

        return convertView;
    }
}
