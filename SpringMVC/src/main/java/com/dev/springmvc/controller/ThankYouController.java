package com.dev.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ThankYouController {
	
	@GetMapping("thankyou")
	public String sayThanks()
	{
		return "thankyou";
	}

}
