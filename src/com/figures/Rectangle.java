package com.figures;

public class Rectangle extends Shape {
    private Vector2 topLeftPoint;
    private Vector2 bottomRightPoint;

    public Rectangle(Vector2 topLeftPoint, Vector2 bottomRightPoint, String hexColor) {
        super(hexColor);
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник с точками: \n" +
                "{" + this.topLeftPoint.getX() + ", " + this.topLeftPoint.getY() + "}\n" +
                "{" + this.bottomRightPoint.getX() + ", " + this.topLeftPoint.getY() + "}\n" +
                "{" + this.topLeftPoint.getX() + ", " + this.bottomRightPoint.getY() + "}\n" +
                "{" + this.bottomRightPoint.getX() + ", " + this.bottomRightPoint.getY() + "}");
    }
}
