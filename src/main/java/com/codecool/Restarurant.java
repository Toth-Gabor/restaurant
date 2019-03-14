package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Restarurant {
    
    private String name;
    private List<Guest> guests;
    private Waiter waiter;
    private Shef shef;
    
    public Restarurant(String name, Waiter waiter, Shef shef) {
        this.name = name;
        this.guests = new ArrayList<>();
        this.waiter = waiter;
        this.shef = shef;
    }
    
    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
}
