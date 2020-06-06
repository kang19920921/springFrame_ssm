package com.kang.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//先定义自己的注解类，其中value为数据源的key值
public @interface DataSource {
	
   //value为数据源的key值
   String value();	
	
}
