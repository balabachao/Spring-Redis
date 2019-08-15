package com.config;

import com.MyFilter;
import com.entity.Person;
import com.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: config
 * @Author: cuiyanchao
 * @CreateTime: 2019-06-18 10:40
 * @Description: ${Description}
 */
@Configuration
@ComponentScan(value = "com",includeFilters = {
        //@ComponentScan.Filter(type = FilterType.ANNOTATION,classes ={Controller.class}),
      //  @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilter.class})
},useDefaultFilters = false)
//value :指定扫描的包
//includeFilters =Filter[] 包含什么组件
//excludeFilters =Filter[] 排除什么组件
public class MyConfig {
    @Bean
    /**
     *
     */
    public Person person(){
        return  new Person("xiao","15");
    }

}
