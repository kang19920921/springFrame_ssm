package com.kang.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	
	// ��ȡ����Դ����
    // spring����ʹ������ĵط������ô����  determineCurrentLookupKey() ��������ȡ����Դ��keyֵ��
	@Override
	protected Object determineCurrentLookupKey() {
		
		
		// TODO Auto-generated method stub
		return HandleDataSource.getDataSource();
	}
	
	
}
