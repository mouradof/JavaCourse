package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import com.javaCourse.services.PrepareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Musician {

    private final PrepareService prepareService;

    @Autowired
    public Guitarist(PrepareService prepareService) {
        this.prepareService = prepareService;
    }
    @Override
    public String playYourPartition(){
        return "the spanish guitar";
    }

    @Override
    public String getPrepa() {
        return prepareService.getPreparation();
    }
}
