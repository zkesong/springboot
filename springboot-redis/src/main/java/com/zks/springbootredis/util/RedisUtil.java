package com.zks.springbootredis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/13 21:05
 * @Description:
 */
public class RedisUtil {

    @Autowired
    private static RedisTemplate<String, String> redisTemplate;

    public static void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

}
