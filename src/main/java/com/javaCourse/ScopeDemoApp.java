package com.javaCourse;

import com.javaCourse.servicesImplementation.Guitarist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {
    public static void main(String[] args){
        // Create Spring Container, load configuration
        ClassPathXmlApplicationContext context =  new
        ClassPathXmlApplicationContext("applicationContext.xml");

        Guitarist a = context.getBean("guitarist", Guitarist.class);
        Guitarist b = context.getBean("guitarist", Guitarist.class);

        // Use musician methods
        System.out.println("a and b reference same object : " + (a==b));
        System.out.println("a reference memory address : " + a);
        System.out.println("b reference memory address : " + b);

        // Close context
        context.close();
    }
}
