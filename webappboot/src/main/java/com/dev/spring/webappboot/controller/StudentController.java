package com.dev.spring.webappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.spring.webappboot.model.Student;
import com.dev.spring.webappboot.service.StudentService;


@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentService ss;
    
    @PostMapping("add") 
    public String addStudent(@RequestParam String name, @RequestParam Double exp, ModelMap model)
    {
        ss.saveStudent(new Student(name, exp));
        
        List<Student> list = ss.getAllStudents();
        
        //add list as the request attribute in home.jsp
        model.put("studentList", list);
        
         return "home"; //WEB-INF/views/home.jsp
    }

}
