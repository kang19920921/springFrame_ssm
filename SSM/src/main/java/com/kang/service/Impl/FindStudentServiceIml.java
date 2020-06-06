package com.kang.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kang.config.DataSource;
import com.kang.dao.FindAllDao;
import com.kang.service.FindStudentService;



@Service
@DataSource("MYSQL")
public class FindStudentServiceIml implements FindStudentService {

	@Autowired
	FindAllDao  findAllDao;
	
	
	@Transactional
	@Override
	public List<String> findALL() {
		
		
		return  findAllDao.findAll();
		
	}

}
