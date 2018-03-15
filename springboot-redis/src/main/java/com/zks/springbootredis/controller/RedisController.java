package com.zks.springbootredis.controller;

import com.zks.springbootredis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/15 16:29
 * @Description:
 */
@RestController
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("name/set/{name}")
    public String setValue(@PathVariable String name) {
        redisUtil.set("name", name);
        return "redis set name=" + name;
    }
}
