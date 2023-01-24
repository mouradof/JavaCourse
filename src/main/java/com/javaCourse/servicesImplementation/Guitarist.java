package com.javaCourse.servicesImplementation;

import com.javaCourse.services.Musician;
import org.springframework.stereotype.Component;

@Component("Banda Taurina")
public class Guitarist implements Musician {
    @Override
    public String playYourPartition(){
        return "the spanish guitar";
    }

    @Override
    public String getPrepa() {
        return null;
    }
}
