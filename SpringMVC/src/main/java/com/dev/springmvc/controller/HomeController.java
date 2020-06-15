package com.dev.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.webapp.model.Student;
import com.dev.webapp.service.HomeService;



@Controller // This is controller
public class HomeController {
	
	
	@Autowired // adiing dependency for home service  
	HomeService hs;
	
	@GetMapping("home") // for mvc/home in URl
	public String showHome(ModelMap model) //model is what the controller will pass on to view resolver
	{
		//getting the student list
		List<Student> list= hs.getAllStudents();
		
		//add the list as a request attribute so that it is available to the home.jsp
		model.put("studentList", list);
		
		return "home"; //look for a view with home.jsp in Web-INF folder
		
		
	}
}
