package com.dev.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BubbleSortAlgo implements SortAlgo
{
   public int[] sort(int[] inputArray)
   {
       //sort the array using bubblesort algo
       System.out.println("bubblesort");
           //sort the array using bubblesort algo
       System.out.println("bubblesort");
       return inputArray;
   }
}