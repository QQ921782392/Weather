package com.weather.android.gson;

/**
 * 项目名称：Weather
 * 类描述：
 * 创建人：建航
 * 创建时间：2017/2/24 17:49
 * 修改人：建航
 * 修改时间：2017/2/24 17:49
 * 修改备注：
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
