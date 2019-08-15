package com.config;

import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project: Spring-Boot
 * Package: com.config
 * Author: cuiyanchao
 * CreateTime: 2019-06-20 09:59:52
 * Description: ${Description}
 */
@Configuration
public class MyConfig2 {
    @Bean("person")
    public Person person(){
        return new Person("张三","56");
    }
}
