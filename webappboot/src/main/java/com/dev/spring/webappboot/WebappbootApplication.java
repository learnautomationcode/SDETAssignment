
package com.dev.spring.webappboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebappbootApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(WebappbootApplication.class);
    public static void main(String[] args) {
    	ConfigurableApplicationContext ctx= SpringApplication.run(WebappbootApplication.class, args);
        
//        FOR(STRING BEAN: CTX.GETBEANDEFINITIONNAMES())
//        { LOGGER.DEBUG(BEAN); 
//        }
         
    }

}
