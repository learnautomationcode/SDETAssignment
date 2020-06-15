package com.dev.webapp.model;

public class Student {

	public String name;
	public String exp;
	
	public Student(String name, String exp)
	{
		super();
		this.name=name;
		this.exp=exp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	
	
	
}
