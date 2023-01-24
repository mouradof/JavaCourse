package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import com.javaCourse.services.PrepareService;

public class BassPlayer implements Musician {
    private PrepareService service;

    public BassPlayer(PrepareService service) {
        this.service = service;
    }
    @Override
    public String playYourPartition() {
        return "I played a bass melody";
    }
    @Override
    public String getPrepa(){
        return service.getPreparation();
    }
}
