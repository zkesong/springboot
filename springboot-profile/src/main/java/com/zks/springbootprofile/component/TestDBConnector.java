package com.zks.springbootprofile.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:39
 * @Description:
 */
@Component
@Profile("redisdb")
public class TestDBConnector implements DBConnector {

    @Autowired
    private DBConfig dbConfig;

    @Override
    public String connect() {
        return "redis db" + "info" + dbConfig;
    }
}
