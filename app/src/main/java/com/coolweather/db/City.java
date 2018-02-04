package com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 张佳欣 on 2018/2/4.
 */

public class City extends DataSupport {

    private int id;
    /**
     * 市的名字
     */
    private String cityName;
    /**
     * 市代码
     */
    private int cityCode;
    /**
     * 所属省ID值
     */
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
