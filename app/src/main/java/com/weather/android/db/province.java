package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：Weather
 * 类描述：数据表省的数据信息
 * 创建人：建航
 * 创建时间：2017/2/24 13:59
 * 修改人：建航
 * 修改时间：2017/2/24 13:59
 * 修改备注：
 */

/**
 * LitePal中的每一个实体类否必须继承DataSupport
 */
public class province extends DataSupport{
    //类的字段
    private int id;
    //省的名字
    private String provinceName;
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
