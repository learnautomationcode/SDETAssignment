package com.dev.webapp.service;
import com.dev.webapp.model.Student;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class HomeService
{
	public List<Student> getAllStudents()
	{
		List<Student> list = new ArrayList<Student>();
		Student s1= new Student("Rohit", "12 years");
		list.add(s1);
		Student s2= new Student("Virat", "13 years");
		list.add(s2);
		Student s3= new Student("Md Shami", "14 years");
		list.add(s3);
		Student s4 = new Student("Sachin", "24 years");
		list.add(s4);
		Student s5 = new Student("Dhoni", "18 years");
		list.add(s5);
		return list;
	}
}
