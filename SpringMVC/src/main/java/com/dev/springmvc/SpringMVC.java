package com.dev.springmvc;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMVC implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		
		ctx.register(SpringWebConfig.class); //register the class to search for beans
		
		ctx.setServletContext(servletContext); // to bind the ctx object with Servlet Context
		
		// Above 3 lines inform the tomcat container that it is spring mvc application
		
		
		//Next step is to configure dispatcher servlet with servlet context
	javax.servlet.ServletRegistration.Dynamic servletDynamic=	servletContext.addServlet("dispatcher", new DispatcherServlet(ctx)); 
		
	servletDynamic.addMapping("/mvc/*");// informing dispatcher servlet to intercept the request which has mvc in the url
	
	servletDynamic.setLoadOnStartup(1); // all the servlet classes are available once the server starts.. not on the first request.. errors would be notified then and there, not on request
	
	
	
		
		
	}

}
