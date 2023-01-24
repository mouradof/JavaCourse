package com.newspringtest.personnages;

import com.newspringtest.interfaces.Musicien;
import com.newspringtest.interfaces.PrepareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Guitariste implements Musicien {
    private PrepareService prepareService;

    @Value("${guitariste.email}")private String email;
    @Value("${guitariste.nom}")private String nom;
    @Value("${guitariste.prenom}")private String prenom;
    @Value("${guitariste.age}")private String age;
    private ArrayList<String> presentations;

    @Autowired
    public Guitariste(@Qualifier("zenPreparationService") PrepareService unPrepareService){
        this.prepareService = unPrepareService;
    }
    @Override
    public String joueTaPartition() {
        return "DDADADADADADADADADADADADADADADADA";
    }

    @Override
    public String getPrepa() {
        return this.prepareService.getPreparation();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ArrayList<String> getPresentations() {
        return presentations;
    }

    public void setPresentations(ArrayList<String> presentations) {
        this.presentations = presentations;
    }
}
