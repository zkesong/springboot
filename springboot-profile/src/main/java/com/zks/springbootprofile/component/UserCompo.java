package com.zks.springbootprofile.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:01
 * @Description:
 */
@ConfigurationProperties(prefix = "user")
public class UserCompo {

    private String name;

    private String password;

    private Long age;

    public String getUsername() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
