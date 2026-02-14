package com.company.vehicles;

public class Lorry extends Car {
    private int loadCapacity;

    @Override
    public String toString() {
        return super.toString() + ", " + this.loadCapacity;
    }
}
