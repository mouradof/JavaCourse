package com.newspringtest.personnages;

import com.newspringtest.interfaces.Musicien;
import com.newspringtest.interfaces.PrepareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Trompetiste implements Musicien {
    private PrepareService prepareService;
    private String email;
    private String site;
    public Trompetiste(  ){

    }
    @Autowired
    public Trompetiste(@Qualifier("hardPreparationService") PrepareService unPrepareService) {
        this.prepareService = unPrepareService;
    }
    @Override
    public String joueTaPartition() {
        return "La trompette";
    }

    @Override
    public String getPrepa() {
        return this.prepareService.getPreparation();
    }



}
