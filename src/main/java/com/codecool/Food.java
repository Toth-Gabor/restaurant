package com.codecool;

import java.util.Random;

public class Food {
    
    private Random rnd = new Random();
    private String name;
    private int calories;
    
    public Food(String name) {
        this.name = name;
        this.calories = rnd.nextInt((1500 - 600) + 1) + 600;
    }
    
    public String getName() {
        return name;
    }
    
    public int getClories() {
        return calories;
    }
    
    @Override
    public String toString() {
        return name + " has " + calories + " calories";
    }
}
