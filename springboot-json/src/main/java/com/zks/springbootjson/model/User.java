package com.zks.springbootjson.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/8 15:41
 * @Description:
 */
public class User {
    private String name;

    private String password;

    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    @JSONField
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
