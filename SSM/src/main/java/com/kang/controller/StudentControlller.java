package com.kang.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kang.service.FindStudentService;

@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentControlller {
	
	@Autowired
	private FindStudentService findStudentService;
	
	@RequestMapping("/findAll")
	public List<String> findAll(){
				
		return findStudentService.findALL();		
	}
}
