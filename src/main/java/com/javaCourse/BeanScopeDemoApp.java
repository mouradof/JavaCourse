package com.javaCourse;

import com.javaCourse.services.Musician;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Create Spring Container, load configuration
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve beans from the spring container
        Musician a = context.getBean("oneMusician", Musician.class);
        Musician b = context.getBean("oneMusician", Musician.class);

        // Check if memory addresses are same, if same object
        boolean result = (a == b);

        // show result in console
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + a);
        System.out.println("\nMemory location for alphaCoach: " + b + "\n");
    }
}