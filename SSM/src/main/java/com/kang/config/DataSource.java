package com.kang.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//�ȶ����Լ���ע���࣬����valueΪ����Դ��keyֵ
public @interface DataSource {
	
   //valueΪ����Դ��keyֵ
   String value();	
	
}
