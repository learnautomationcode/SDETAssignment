package com.dev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl
{
//sorting
  //searching
  
  //SortAlgo heapSortAlgo;
  
  @Qualifier("bubble")
  @Autowired
  SortAlgo sa;
  
  /*
   * public BinarySearchImpl(SortAlgo sortAlgo) { this.sa = sortAlgo; }
   */
    public SortAlgo getSortAlgo() { return sa; }
   
  
  public int binarySearch(int[] arr, int toSearch)
  {
      //SortAlgo sortAlgo = new BubbleSortAlgo();
      int[] result = sa.sort(arr);
      System.out.println(sa);
      return 1;
  }
}
