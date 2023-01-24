package com.javaCourse;

import com.javaCourse.services.Musician;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

        Musician musician= context.getBean("Banda Taurina", Musician.class);

        System.out.println(musician.playYourPartition());

        context.close();
    }
}
