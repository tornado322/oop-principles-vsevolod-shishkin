package com.figures;

public class Circle extends Shape {
    private Vector2 center;
    private int radius;

    public Circle(Vector2 center, int radius, String hexColor) {
        super(hexColor);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг радиусом " + this.radius + " вокруг точки: \n" +
                " {" + this.center.getX() + "; " + this.center.getY() + "}");
    }
}
