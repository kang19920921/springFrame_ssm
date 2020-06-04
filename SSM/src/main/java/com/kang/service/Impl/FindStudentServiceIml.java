package com.kang.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kang.dao.FindAllDao;
import com.kang.service.FindStudentService;



@Service
public class FindStudentServiceIml implements FindStudentService {

	@Autowired
	FindAllDao  findAllDao;
	
	@Override
	public List<String> findALL() {
		
		
		return  findAllDao.findAll();
		
	}

}
