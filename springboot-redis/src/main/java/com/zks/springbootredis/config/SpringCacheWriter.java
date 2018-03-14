package com.zks.springbootredis.config;

import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.lang.Nullable;

import java.time.Duration;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/13 21:23
 * @Description:
 */
public class SpringCacheWriter implements RedisCacheWriter {
    @Override
    public void put(String s, byte[] bytes, byte[] bytes1, @Nullable Duration duration) {

    }

    @Nullable
    @Override
    public byte[] get(String s, byte[] bytes) {
        return new byte[0];
    }

    @Nullable
    @Override
    public byte[] putIfAbsent(String s, byte[] bytes, byte[] bytes1, @Nullable Duration duration) {
        return new byte[0];
    }

    @Override
    public void remove(String s, byte[] bytes) {

    }

    @Override
    public void clean(String s, byte[] bytes) {

    }
}
