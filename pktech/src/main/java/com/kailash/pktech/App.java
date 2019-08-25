package com.kailash.pktech;

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
        //Vehicle obj = new Bike();
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj = (Vehicle) context.getBean("bike");
//        obj.drive();
    	
    	
    	Car obj = (Car) context.getBean("car");
        obj.drive();

    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
       
    }
}
