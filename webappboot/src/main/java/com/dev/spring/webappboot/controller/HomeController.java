package com.dev.spring.webappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.spring.webappboot.model.Student;
import com.dev.spring.webappboot.service.StudentService;



@Controller // This is controller
public class HomeController {
	
	
	@Autowired // adiing dependency for home service  
	StudentService hs;
	
	@GetMapping("/home") // for mvc/home in URl
	public String showHome(ModelMap model) //model is what the controller will pass on to view resolver
	{
		//getting the student list
		List<Student> list= hs.getAllStudents();
		
		//add the list as a request attribute so that it is available to the home.jsp
		model.put("studentList", list);
		
		return "home"; //look for a view with home.jsp in Web-INF folder
		
		
	}
}
