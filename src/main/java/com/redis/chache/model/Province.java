package com.redis.chache.model;

import java.io.Serializable;

/**
 * @author chengdu
 * @date 2019/7/6.
 */
public class Province implements Serializable {

    private static final long serialVersionUID = 1L;

    private String countryName;

    private Integer id;

    private String code;

    private String name;


    public Province(String countryName, Integer id, String code, String name) {
        this.countryName = countryName;
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
