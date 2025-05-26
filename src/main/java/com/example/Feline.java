package com.example;

import java.util.List;


public class Feline extends Animal implements Predator {
    @Override
    public List<String> getFood() throws Exception {
        return super.getFood("Хищник");
    }

    @Override
    public int getKittens() {
        return 1;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public List<String> eatMeat() {
    }
}