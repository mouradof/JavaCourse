package com.example.coursjava;

public class MyApp {
    public static void main(String[] args){
        // Create Object
        Musician musician = new BassPlayer();

        // Use The Object
        System.out.println(musician.playYourPartition());
    }
}