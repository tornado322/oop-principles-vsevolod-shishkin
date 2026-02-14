package com.company.vehicles;

public class SportCar extends Car {
    private int speedLimit;

    @Override
    public String toString() {
        return super.toString() + ", " + this.speedLimit;
    }
}
