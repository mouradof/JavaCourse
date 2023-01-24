package com.newspringtest.preparation_service;

import com.newspringtest.interfaces.PrepareService;
import org.springframework.stereotype.Component;

@Component
public class ZenPreparationService implements PrepareService {
    @Override
    public String getPreparation() {
        return "Je me relaxe en respirant profondément";
    }
}
