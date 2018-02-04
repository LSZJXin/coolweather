package com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 张佳欣 on 2018/2/4.
 */

public class County extends DataSupport {

    private int id;
    /**
     * 县名字
     */
    private String countyName;
    /**
     * 县天气
     */
    private String weatherId;
    /**
     * 所属市ID
     */
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
