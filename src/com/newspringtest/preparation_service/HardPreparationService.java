package com.newspringtest.preparation_service;

import com.newspringtest.interfaces.PrepareService;
import org.springframework.stereotype.Component;

@Component
public class HardPreparationService implements PrepareService {
    @Override
    public String getPreparation() {
        return "Je vais tout casser";
    }
}
