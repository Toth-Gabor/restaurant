package com.codecool;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    
    private String name;
    protected List<Food> foods;
    
    public Person(String name) {
        this.name = name;
        this.foods = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public List<Food> getFoods() {
        return foods;
    }
}
