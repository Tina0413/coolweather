package com.hello.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tina on 2018/6/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
