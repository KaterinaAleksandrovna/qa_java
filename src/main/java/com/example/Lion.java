package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Predator feline) throws Exception {
        this.feline = (Feline) feline;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола");
        }
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittens() {
        return feline.getKittens();
    }
}