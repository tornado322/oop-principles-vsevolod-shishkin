package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class Car {
    private String brand;
    private String type;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return this.brand + ", " + this.type + ", " + this.weight + ", " +
                this.driver.getFullName() + ", " + this.driver.getDrivingExperienceYears() + ", " +
                this.engine.getVendor() + ", " + this.engine.getPower();
    }
}
