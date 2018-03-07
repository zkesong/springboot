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
@Component
public class RandomCompo {

    @Value("${user.secret}")
    private String secret;

    @Value("${user.number.in.range}")
    private Integer number;

    public String getSecret() {
        return secret;
    }

    public Integer getNumber() {
        return number;
    }
}
