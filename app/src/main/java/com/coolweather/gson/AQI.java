package com.coolweather.gson;

/**
 * Created by 张佳欣 on 2018/2/5.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
