package com.javaCourse;

import com.javaCourse.services.Musician;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemoApp {
    public static void main(String[] args){
        // Create Spring Container, load configuration
        ClassPathXmlApplicationContext context =  new
        ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from the spring container
        Musician musician = context.getBean("guitarist", Musician.class);

        // Call a method on the bean
        System.out.println(musician.playYourPartition());

        // Use the DI
        System.out.println(musician.getPrepa());

        // Close the App context
        context.close();
    }
}
