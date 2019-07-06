package com.redis.chache.model;

import java.io.Serializable;

/**
 * @author chengdu
 * @date 2019/7/6.
 */
public class City implements Serializable{

    private static final long serialVersionUID = 1L;

    private String provinceName;

    private String id;

    private String code;

    private String name;

    public City(String provinceName, String id, String code, String name) {
        this.provinceName = provinceName;
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
