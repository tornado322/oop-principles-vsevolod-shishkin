package com.figures;

public abstract class Shape {
    private String hexColor;

    public Shape(String hexColor) {
        this.hexColor = hexColor;
    }

    public abstract void draw();
}
