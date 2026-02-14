package com.figures;

public class Circle extends Shape {
    private Vector2 center;
    private int radius;

    public Circle(Vector2 center, int radius, String hexColor) {
        super(hexColor);
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг радиусом " + radius + "вокруг точки: \n {" + center.getX() + "; " + center.getY() + "}");
    }
}
