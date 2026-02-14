package com.figures;

public class Circle extends Shape {
    private Vector2 center;

    public Circle(Vector2 center, String hexColor) {
        super(hexColor);
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг вокруг точки: \n {" + center.getX() + "; " + center.getY() + "}");
    }
}
