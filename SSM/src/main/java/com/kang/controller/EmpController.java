package com.kang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kang.service.FindEmpService;



@Controller
@ResponseBody
@RequestMapping("/emp")
public class EmpController {
	
		
	@Autowired
	private FindEmpService  findEmpService;
	
	@RequestMapping("/findAll")
	public List<String> findAll(){
				
		return findEmpService.findAllEmp();		
	}


}
