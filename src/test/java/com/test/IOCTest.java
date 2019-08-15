package com.test;

import com.config.MyConfig;
import com.config.MyConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: com.test
 * @Author: cuiyanchao
 * @CreateTime: 2019-06-18 17:02
 * @Description: ${Description}
 */

public class IOCTest {
    @Test
    @SuppressWarnings("resource")
    public void test01(){





        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MyConfig.class);
        String[] names= applicationContext.getBeanDefinitionNames();
        for (String name:names
             ) {
            System.out.println(name);
        }
        System.out.println("####################");
        System.out.println(names.length);
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] names= applicationContext.getBeanDefinitionNames();
        for (String name:names
                ) {
            System.out.println(name);
        }
        System.out.println("####################");
        System.out.println(names.length);
    }

}
