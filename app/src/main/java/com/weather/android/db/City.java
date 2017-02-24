package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：Weather
 * 类描述：数据表市的数据信息
 * 创建人：建航
 * 创建时间：2017/2/24 14:03
 * 修改人：建航
 * 修改时间：2017/2/24 14:03
 * 修改备注：
 */

/**
 * LitePal中的每一个实体类否必须继承DataSupport
 */
public class City extends DataSupport {
    //类的字段
    private int id;
    //市的名字
    private String cityName;
    //市的代号
    private int cityCode;
    //当前市所属的省的id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
