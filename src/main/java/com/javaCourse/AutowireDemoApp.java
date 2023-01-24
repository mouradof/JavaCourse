package com.javaCourse;

import com.javaCourse.servicesImplementation.Guitarist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemoApp {
    public static void main(String[] args){
        // Create Spring Container, load configuration
        ClassPathXmlApplicationContext context =  new
        ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from the spring container
        Guitarist musician = context.getBean("guitarist", Guitarist.class);

        System.out.println(musician.getEmail());
        System.out.println(musician.getSite());

        // Close the App context
        context.close();
    }
}
