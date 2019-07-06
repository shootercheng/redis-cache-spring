package com.redis.chache.service;

import org.mybatis.caches.redis.RedisCache;

/**
 * @author chengdu
 * @date 2019/7/6.
 */
public class CacheCommonService {

    public String getId(RedisCache redisCache) {
        return redisCache.getId();
    }


    public void putObject(RedisCache redisCache, Object key, Object value) {
        redisCache.putObject(key, value);
    }

    public Object getObject(RedisCache redisCache, Object key) {
        return redisCache.getObject(key);
    }

    public Object removeObject(RedisCache redisCache, Object key) {
        return redisCache.removeObject(key);
    }

    public void clear(RedisCache redisCache) {
        redisCache.clear();
    }

    public int getSize(RedisCache redisCache) {
        return redisCache.getSize();
    }
}
