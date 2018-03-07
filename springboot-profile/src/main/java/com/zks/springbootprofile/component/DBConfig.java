package com.zks.springbootprofile.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:42
 * @Description:
 */
@Component
public class DBConfig {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DBConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
