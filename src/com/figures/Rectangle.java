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
                "{" + topLeftPoint.getX() + ", " + topLeftPoint.getY() + "}\n" +
                "{" + bottomRightPoint.getX() + ", " + topLeftPoint.getY() + "}\n" +
                "{" + topLeftPoint.getX() + ", " + bottomRightPoint.getY() + "}\n" +
                "{" + bottomRightPoint.getX() + ", " + bottomRightPoint.getY() + "}");
    }
}
