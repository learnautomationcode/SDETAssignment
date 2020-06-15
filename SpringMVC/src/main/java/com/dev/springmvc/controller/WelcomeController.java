package com.dev.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class WelcomeController {

	@RequestMapping("welcome") //handler mapping with dispatcher servlet
	//@ResponseBody //if we want the message to be printed, we will use this annotation, otherwise to cnfigure view resolver and render jsp ,we should remove @ResponseBody annotation
	public String welcome()
	{
		return "welcome";
	}

	@GetMapping("display") //for get request
	@ResponseBody //for view and default view Resolver is called
	public String displaymsg(@RequestParam(name="msg") String message)// request param is for getting parameter in url and msg param and msg in url should match
	{
		return "Message is:"+message;
	}
	//name=msg is for user defined parameter if needs to be passed
	
	// To configure jsp, we will configure view resolver
	
	//Methods should always have return type
	

}

