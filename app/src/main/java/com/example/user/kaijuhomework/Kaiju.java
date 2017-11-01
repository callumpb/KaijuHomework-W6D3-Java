package com.example.user.kaijuhomework;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Kaiju {

    String name;
    abstract String roar();
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String Roar() {
        return "ROAR!";
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void attack(Vehicle type) {
        type.takesDamage(this.attackValue);

    }
}
