package com.dev.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("heap")
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Primary
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HeapSortAlgo implements SortAlgo
{
   public int[] sort(int[] inputArray)
   {
       //sort the array using bubblesort algo
       System.out.println("heapsort");
       
       return inputArray;
   }
}
