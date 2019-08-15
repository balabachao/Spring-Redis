package com.entity;

import com.config.MyConfig;
import com.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: entity
 * @Author: cuiyanchao
 * @CreateTime: 2019-06-18 10:42 * @Description: ${Description}
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyConfig.class);
       Object object= applicationContext.getBean(Person.class);
        System.out.println(object);
    }
}
