package com.dev.spring.webappboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThankYouController 
{
    @GetMapping("/thankyou") //thankyou
    public String thankyou()
    {
         return "thankyou"; //WEB-INF/views/thankyou.jsp
    }
}
