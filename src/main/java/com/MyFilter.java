package com;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Project: Spring-Boot
 * Package: com
 * Author: cuiyanchao
 * CreateTime: 2019-06-19 15:39:03
 * Description: ${Description}
 */
public class MyFilter implements TypeFilter {
    /**
     *
     * @param metadataReader ：读取到的当前正在扫描类的信息
     * @param metadataReaderFactory: 可以获取到其他任何类的信息
     * @return
     * @throws IOException
     */

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源(资源路劲)
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("------>"+className);
        String a="-";
        for (int i=0;i<2;i++){
            System.out.println(a);
        }
        return false;
    }
}
