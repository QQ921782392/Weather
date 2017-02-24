package com.weather.android.db;

/**
 * 项目名称：Weather
 * 类描述：数据表县的数据信息
 * 创建人：建航
 * 创建时间：2017/2/24 14:10
 * 修改人：建航
 * 修改时间：2017/2/24 14:10
 * 修改备注：
 */

import org.litepal.crud.DataSupport;

/**
 * LitePal中的每一个实体类否必须继承DataSupport
 */
public class County extends DataSupport{
    //类的字段
    private int id;
    //县的名字
    private String countyName;
    //县所对应的天气id
    private String weatherId;
    //当前县所属的市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
