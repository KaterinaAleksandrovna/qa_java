package com.example;

import java.util.List;

public class Lion {
    private final Predator predator;
    private final boolean hasMane;

    public Lion(String sex, Predator predator) throws Exception {
        this.predator = predator;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола");
        }
    }

    public List<String> getFood() throws Exception {
        return predator.getFood();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittens() {
        return predator.getKittens();
    }
}