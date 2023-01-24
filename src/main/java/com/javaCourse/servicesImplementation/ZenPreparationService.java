package com.javaCourse.servicesImplementation;

import com.javaCourse.services.PrepareService;

public class ZenPreparationService implements PrepareService {
    @Override
    public String getPreparation(){
        return "I relax by taking deep breaths";
    }
}