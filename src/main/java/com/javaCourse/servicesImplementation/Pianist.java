package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import com.javaCourse.services.PrepareService;

public class Pianist implements Musician {
    private final PrepareService service;
    public Pianist(PrepareService oneService){
        service = oneService;
    }
    @Override
    public String playYourPartition() {
        return "I played a piano melody";
    }
    @Override
    public String getPrepa(){
        return service.getPreparation();
    }
}