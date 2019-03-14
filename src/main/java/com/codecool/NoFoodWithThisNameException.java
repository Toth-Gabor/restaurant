package com.codecool;

public class NoFoodWithThisNameException extends RestaurantExceptions {
    public NoFoodWithThisNameException(String message) {
        super(message);
    }
}
