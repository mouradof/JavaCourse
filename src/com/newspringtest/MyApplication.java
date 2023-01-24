package com.newspringtest;

import com.newspringtest.interfaces.Musicien;
import com.newspringtest.personnages.Guitariste;
import com.newspringtest.personnages.Trompetiste;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationConfig.xml");
        Trompetiste trompetiste = context.getBean("trompetiste", Trompetiste.class);
        Guitariste guitariste = context.getBean("guitariste", Guitariste.class);
        System.out.println(trompetiste.joueTaPartition());
        System.out.println(trompetiste.getPrepa());

        ArrayList<String> prestas = new ArrayList<>();
        prestas.add("Mallemort");
        prestas.add("Marseille");
        guitariste.setPresentations(prestas);
        System.out.println(guitariste.getPrenom() + " " + guitariste.getNom() + " " + guitariste.getAge());
        System.out.println(guitariste.getPresentations());
        System.out.println(guitariste.joueTaPartition());
        System.out.println(guitariste.getPrepa());
        System.out.println(guitariste.getEmail());

        context.close();
    }
}