package com.company.vehicles;

import com.company.com.company.professions.Driver;
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
        String info = "{" + brand + ", " + type + ", " + weight + ", " +
                driver.getFullName() + ", " + driver.getExperience() + ", " +
                engine.getPerformance() + ", " + engine.getPower();
        if (this instanceof Lorry) {
            info += ", " + ((Lorry) this).getLoadCapacity();
        }
        if (this instanceof SportCar) {
            info += ", " + ((SportCar) this).getSpeedLimit();
        }
        info += "}";
        return info;
    }
}
