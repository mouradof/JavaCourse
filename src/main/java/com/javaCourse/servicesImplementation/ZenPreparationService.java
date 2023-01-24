package com.javaCourse.servicesImplementation;

import com.javaCourse.services.PrepareService;
import org.springframework.stereotype.Component;

@Component
public class ZenPreparationService implements PrepareService {
    @Override
    public String getPreparation(){
        return "I relax by taking deep breaths";
    }
}