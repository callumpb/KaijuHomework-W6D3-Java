package com.example.user.kaijuhomework;

import behaviours.Movement;

/**
 * Created by user on 01/11/2017.
 */

public class Margaret extends Kaiju implements Movement{

    public Margaret(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "cool!";
    }

    public String move() {
        return "Flaps wings, flies forward";
    }
}
