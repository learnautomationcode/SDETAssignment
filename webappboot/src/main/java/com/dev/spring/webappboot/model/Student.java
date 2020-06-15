package com.dev.spring.webappboot.model;

import org.springframework.stereotype.Repository;

public class Student {

    public String name;
    
    public Student(String name, Double exp)
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
    
    public Double getExp() {
        return exp;
    }

    public void setExp(Double exp) {
        this.exp = exp;
    }

    public Double exp;
    
    
}
