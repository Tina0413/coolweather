package com.hello.coolweather.gson;

/**
 * Created by Tina on 2018/6/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
