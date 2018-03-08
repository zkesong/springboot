package com.zks.springbootjson.controller;

import com.zks.springbootjson.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/8 15:42
 * @Description:
 */
@RestController
public class JsonController {

    @RequestMapping("users/{id}")
    public Object getUser(@PathVariable Integer id) {
        User user = new User();
        user.setAge(id);
        user.setName("zengkesong");
        user.setPassword("abcdef");
        user.setBirthday(new Date());
        return user;
    }
}
