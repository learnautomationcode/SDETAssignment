package com.dev.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

// what are beans- @component
// what are dependencies- @autowired
// where to searh or look for the beans- @ComponentScan



@Component
//@ComponentScan("com.dev.spring")
public class AppDemo {
	 private static Logger LOGGER = LoggerFactory.getLogger(AppDemo.class);
	public static void main(String[] args) {
		

        AbstractApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
        int[] arr = {2,33,5,8};
        //BinarySearchImpl bSearchImpl = new BinarySearchImpl(new BubbleSortAlgo());
        
        AbstractApplicationContext ctx1= new AnnotationConfigApplicationContext(SpringConfig.class);
        BinarySearchImpl bSearchImpl = ctx.getBean(BinarySearchImpl.class);
        BinarySearchImpl bSearchImpl1 = ctx.getBean(BinarySearchImpl.class);
        LOGGER.info("search1-> {}, search2->{}", bSearchImpl,bSearchImpl1);
        LOGGER.info("sort1 -> {}, sort2-> {}", bSearchImpl.getSortAlgo(),bSearchImpl1.getSortAlgo());
        
        BinarySearchImpl bSearchImpl2 = ctx1.getBean(BinarySearchImpl.class);
        BinarySearchImpl bSearchImpl3 = ctx1.getBean(BinarySearchImpl.class);
        LOGGER.info("search1-> {}, search2->{}", bSearchImpl2,bSearchImpl3);
        LOGGER.info("sort1 -> {}, sort2-> {}", bSearchImpl2.getSortAlgo(),bSearchImpl3.getSortAlgo());
        

LOGGER.info("gofsingleton1 -> {}, gofsingleton2-> {}", GofSingleton.getInstance(),GofSingleton.getInstance());
        
        GofSingleton gof1 = ctx.getBean(GofSingleton.class);
        GofSingleton gof2 = ctx1.getBean(GofSingleton.class);
        LOGGER.info("gofsingletonFrmCtx -> {}, gofsingletonFrmCtx2-> {}", gof1,gof2);
        LOGGER.info("gofsingleton1 -> {}, gofsingleton2-> {}", GofSingleton.getInstance(),GofSingleton.getInstance());
        
//        GofSingleton gof3 = ctx.getBean(GofSingleton.class);
//        GofSingleton gof4 = ctx1.getBean(GofSingleton.class);
//        LOGGER.info("gofsingletonFrmCtx -> {}, gofsingletonFrmCtx2-> {}", gof3,gof4);
//        
        int result = bSearchImpl.binarySearch(arr, 5);
        
        System.out.println("Result is:" + result);
		
	}

	
	

}
