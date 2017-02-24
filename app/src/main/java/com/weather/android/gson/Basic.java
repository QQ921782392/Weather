package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：Weather
 * 类描述：
 * 创建人：建航
 * 创建时间：2017/2/24 17:42
 * 修改人：建航
 * 修改时间：2017/2/24 17:42
 * 修改备注：
 */
public class Basic {
    /**
     * JSON中的一些字符不太适合直接作为Java字段来命名，使用@SerializedName注解的方式让JSON字段和Java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
