package com.zks.springbootprofile.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:38
 * @Description:
 */
@Component
@Profile("mysqldb")
public class ProdDBConnector implements DBConnector {

    @Autowired
    private DBConfig dbConfig;

    @Override
    public String connect() {
        return "mysql db" + "info:" + dbConfig;
    }
}
