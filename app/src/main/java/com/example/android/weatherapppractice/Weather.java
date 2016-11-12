package com.example.android.weatherapppractice;

/**
 * Created by user on 5/11/2016.
 */
public class Weather {
    private String date;
    private String averageTemp;
    private String weatherDescription;
    private int weatherIcon;

    public Weather(String date, String averageTemp, String weatherDescription) {
        this.date = date;
        this.averageTemp = averageTemp;
        this.weatherDescription = weatherDescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(String averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
