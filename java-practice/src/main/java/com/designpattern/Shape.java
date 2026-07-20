package com.designpattern;

public interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle is drawing...");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square is drawing...");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle is Drawing...");
    }
}

class ShapeFactory {
    public static Shape createShape(String type) {
        return switch (type) {
            case "Circle" -> new Circle();

            case "Square" -> new Square();

            case "Rectangle" -> new Rectangle();

            default -> throw new IllegalArgumentException("Unknown Shape Type...");
        };
    }
}