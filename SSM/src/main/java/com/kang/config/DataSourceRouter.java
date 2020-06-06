package com.kang.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	
	// 获取数据源名称
    // spring会在使用事务的地方来调用此类的  determineCurrentLookupKey() 方法来获取数据源的key值。
	@Override
	protected Object determineCurrentLookupKey() {
		
		
		// TODO Auto-generated method stub
		return HandleDataSource.getDataSource();
	}
	
	
}
