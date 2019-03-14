package com.codecool;

public class Main {
    
    public static void main(String[] args) {
        Shef shef = new Shef("Jocó");
        Waiter waiter = new Waiter("Pisti");
        Guest guest = new Guest("Lili");
        Restarurant rest = new Restarurant("Faloda",waiter,shef);
        rest.addGuest(guest);
        System.out.println(waiter);
        System.out.println();
        waiter.getOrders(guest);
        waiter.getOrders(guest);
        System.out.println(waiter);
        System.out.println();
        shef.cookFoods(waiter.addOrders());
        waiter.getMeals(shef.addFood());
        System.out.println(waiter);
        System.out.println();
        waiter.addMeals(guest);
        guest.eatFood();
        System.out.println(guest);
        System.out.println(waiter);
        
    }
}
