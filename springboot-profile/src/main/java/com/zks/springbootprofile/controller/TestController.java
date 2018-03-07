package com.zks.springbootprofile.controller;

import com.zks.springbootprofile.component.DBConnector;
import com.zks.springbootprofile.component.RandomCompo;
import com.zks.springbootprofile.component.UserCompo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:08
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private UserCompo userCompo;

    @Autowired
    private RandomCompo randomCompo;

    @Autowired
    private DBConnector dbConnector;

    @RequestMapping("user")
    public String user() {
        return userCompo.getUsername() + "; " + userCompo.getPassword() + "; " + userCompo.getAge();
    }

    @RequestMapping("random")
    public String random() {
        return randomCompo.getSecret() + "; " + randomCompo.getNumber();
    }

    @RequestMapping("db")
    public String dbconnect() {
        return dbConnector.connect();
    }
}
