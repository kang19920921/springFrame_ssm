package com.kang.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

//@Repository
public interface FindAllDao {
		
	List<String> findAll();
	List<Map> findALLByMap();
	
}
