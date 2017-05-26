package com.example.fll.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C515 on 2017/5/26.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
