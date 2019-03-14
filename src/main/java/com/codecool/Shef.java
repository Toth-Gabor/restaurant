package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Shef extends Person {
    
    public Shef(String name) {
        super(name);
    }
    
    public void cookFoods(List<String> orders){
        for (String order : orders) {
            this.foods.add(new Food(order));
        }
    }
    
    public List<Food> addFood(){
        List<Food> cookedFood = new ArrayList<>();
        cookedFood.addAll(this.foods);
        foods.clear();
        return cookedFood;
    }
}
