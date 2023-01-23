package com.javaCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){

        // Create Spring Container, load configuration
        ClassPathXmlApplicationContext context =  new
        ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve a bean from the spring container
        Musician musician = context.getBean("myMusician", Musician.class);

        // Call a method on the bean
        System.out.println(musician.playYourPartition());

        // Close the App context
        context.close();
    }
}