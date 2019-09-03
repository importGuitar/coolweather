package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by SXY on 2019/9/3.
 */
public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {

        return provinceId;
    }

    public void setCityCode(int cityCode) {

        this.cityCode = cityCode;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public String getCityName() {

        return cityName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }
}
