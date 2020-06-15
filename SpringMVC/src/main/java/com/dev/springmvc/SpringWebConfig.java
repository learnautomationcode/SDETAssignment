package com.dev.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@ComponentScan("{com.dev.springmvc,com.dev.springmvc.controller,com.dev.webapp.service,com.dev.webapp.model}")
@Configuration //for configuration setting, for view resolver
public class SpringWebConfig {
	
	@Bean  // is the annotation for view resolver
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver vs=new InternalResourceViewResolver();
		vs.setViewClass(JstlView.class); //For JSP view
		vs.setPrefix("/WEB-INF/views/"); //where to look for views
		vs.setSuffix(".jsp"); // create view resolver and tell dispatcher servlet to render jsp
		return vs;
		
		
		
		
	}

}
