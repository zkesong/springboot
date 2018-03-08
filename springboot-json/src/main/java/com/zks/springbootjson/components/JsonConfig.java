package com.zks.springbootjson.components;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/8 15:55
 * @Description:
 */
@Configuration
public class JsonConfig {
    @Bean
    public HttpMessageConverters fastJsonConverters(){
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        AtomicReference<FastJsonConfig> fastConf = new AtomicReference<>(new FastJsonConfig());

        fastConf.get().setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastJsonConverter.setFastJsonConfig(fastConf.get());

        HttpMessageConverter<?> converter = fastJsonConverter;
        return new HttpMessageConverters(converter);
    }
}
