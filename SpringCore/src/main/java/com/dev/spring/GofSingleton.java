package com.dev.spring;

import org.springframework.stereotype.Component;

@Component
public class GofSingleton
{
  private static GofSingleton gofSingleton = new GofSingleton();
  private GofSingleton(){}
  
  public static GofSingleton getInstance()
  {
      return gofSingleton;
  }
      
}