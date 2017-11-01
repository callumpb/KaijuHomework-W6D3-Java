package com.example.user.kaijuhomework;

import behaviours.Movement;

/**
 * Created by user on 01/11/2017.
 */

public class Godzilla extends Kaiju implements Movement{

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "NEENAW!";
    }

    public String move() {
        return "Stomps forward";
    }
}


