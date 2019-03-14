package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Waiter extends Person {
    
    private List<String> orders;
    private List<String> menu;
    
    public Waiter(String name) {
        super(name);
        this.orders = new ArrayList<>();
        this.menu = new ArrayList<>(Arrays.asList("Gulyásleves", "Rántotthús", "Töltött káposzta", "Somlóigaluska"));
    }
    
    public void getOrders(Guest guest){
        orders.add(guest.order(this.menu));
    }
    
    public List<String> addOrders(){
        return this.orders;
    }
    
    public void getMeals(List<Food> meals) {
        this.orders.clear();
        this.foods = meals;
    }
    
    public void addMeals(Guest guest){
        guest.getFoods(this.foods);
    }
    
    @Override
    public String toString() {
        String result = "Menu: \n";
        for (String food : menu) {
            result += " " + food + "\n";
        }
        result += "Orders: \n";
        if (orders.size() > 0){
            for (String order : orders) {
                result += " " + order + "\n";
            }
        } else {
            result += " There are not any orders!\n";
        }
        result += "Meals: \n";
        if (foods.size() > 0){
            for (Food food : foods) {
                result += " " + food + "\n";
            }
        } else {
            result += " There are not any meals!";
        }
        
        return result;
    }
}
