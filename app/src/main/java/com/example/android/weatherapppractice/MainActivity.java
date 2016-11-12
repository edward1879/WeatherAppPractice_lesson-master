package com.example.android.weatherapppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private WeatherListAdapter weatherListAdapter;
    private ArrayList<Weather> weatherArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherArrayList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView_main);
        Weather weather1 = new Weather("1-Nov","25°","Sunny");
        Weather weather2 = new Weather("2-Nov","26°","Cloudy");
        weatherArrayList.add(weather1);
        weatherArrayList.add(weather2);
        weatherListAdapter = new WeatherListAdapter(weatherArrayList,this);
        listView.setAdapter(weatherListAdapter);


//        System.out.println(weather1.getDate());
//        weather1.setDate("2-Nov");
//        System.out.println(weather1.getDate());


    }
}
