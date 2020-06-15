package com.dev.webapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.webapp.model.Student;
import com.dev.webapp.service.HomeService;


@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
  		HomeService hs = new HomeService();
  		List<Student> students = hs.getAllStudents();
  		
  		request.setAttribute("studentList",students);
  		
  		request.getRequestDispatcher("WEB-INF/views/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
