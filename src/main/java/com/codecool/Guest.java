package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guest extends Person {
    
    private int calories;
    
    
    public Guest(String name) {
        super(name);
        this.calories = 0;
    }
    
    public void eatFood() {
        for (Food food : foods) {
            this.calories += food.getClories();
        }
        foods.clear();
    }
    
    public void getFoods(List<Food> meals){
        this.foods = meals;
    }
    
    public String order(List<String> menu){
        Random rnd = new Random();
        return menu.get(rnd.nextInt(menu.size() - 1));
    }
    
    public int getCalories() {
        return calories;
    }
    
    @Override
    public String toString() {
        return getName() + " has " + calories + " calories";
    }
}
