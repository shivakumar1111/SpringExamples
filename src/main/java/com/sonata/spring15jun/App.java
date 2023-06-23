package com.sonata.spring15jun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Shape shape=(Shape)context.getBean("triangle");
    	
    	shape.draw();
    	
   
    }
}
