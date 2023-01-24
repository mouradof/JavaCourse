package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import com.javaCourse.services.PrepareService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Guitarist implements Musician {
    @Value("${email}")private String email;
    @Value("${site}")private String site;
    private final PrepareService prepareService;
    public Guitarist(@Qualifier("zenPreparationService") PrepareService prepareService) {
        this.prepareService = prepareService;
    }

    @PostConstruct
    public void myInitMethod(){
        System.out.println("After Constructor");
    }
    @PreDestroy
    public void myDestroyMethod(){
        System.out.println("Before bean suppression");
    }
    @Override
    public String playYourPartition(){
        return "the spanish guitar";
    }
    @Override
    public String getPrepa() {
        return prepareService.getPreparation();
    }
    public String getEmail() {
        return email;
    }
    public String getSite() {
        return site;
    }
}
