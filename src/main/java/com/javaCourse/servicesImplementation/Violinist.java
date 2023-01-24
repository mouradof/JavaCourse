package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import com.javaCourse.services.PrepareService;

public class Violinist implements Musician {
    private final PrepareService service;
    public Violinist(PrepareService oneService){
        service = oneService;
    }
    @Override
    public String playYourPartition() {
        return "I played a string melody";
    }
    @Override
    public String getPrepa(){
        return service.getPreparation();
    }
}