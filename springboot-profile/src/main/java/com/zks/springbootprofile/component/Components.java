package com.zks.springbootprofile.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/7 15:21
 * @Description:
 */
@Configuration
public class Components {

    @Bean
    public UserCompo userCompo() {
        return new UserCompo();
    }
}
