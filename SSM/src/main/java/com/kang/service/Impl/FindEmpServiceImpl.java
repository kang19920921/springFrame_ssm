package com.kang.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kang.config.DataSource;
import com.kang.dao.FindEmpDao;
import com.kang.service.FindEmpService;


@Service
@DataSource("ORACLE")
public class FindEmpServiceImpl implements FindEmpService {
	
	
	@Autowired
	FindEmpDao  findEmpDao;

	
	@Override
	public List<String> findAllEmp() {
		// TODO Auto-generated method stub
		return findEmpDao.findEmpAll();
	}

}
