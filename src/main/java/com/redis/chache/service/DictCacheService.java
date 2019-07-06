package com.redis.chache.service;

import com.redis.chache.model.City;
import com.redis.chache.model.Province;
import org.apache.ibatis.cache.Cache;
import org.mybatis.caches.redis.RedisCache;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author chengdu
 * @date 2019/7/6.
 */
@Service
public class DictCacheService extends CacheCommonService {

    private RedisCache redisCache = new RedisCache("cache:dict:country");

    private RedisCache cityCache = new RedisCache("cache:dict:province");

    private RedisCache systemCache = new RedisCache("cache:dict:system");

    public void putCountry(String key, List<Province> provinceList){
        putObject(redisCache, key, provinceList);
    }

    public List<Province> getCountry(String countryKey){
        Object object = getObject(redisCache, countryKey);
        return object != null ? (List<Province>) object : null;
    }

    public void putProvinces(String cityCode, List<City> cities){
        putObject(cityCache, cityCode, cities);
    }

    public List<City> getCitys(String proKey){
        Object object = getObject(cityCache, proKey);
        return object != null ? (List<City>) object : null;
    }

    public void putSystem(String key, String token){
        putObject(systemCache, key, token);
    }

    public String getToken(String key){
        return String.valueOf(getObject(systemCache, key));
    }

    // remove

    // clear

    // size
}
