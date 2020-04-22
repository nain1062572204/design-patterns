package com.wang;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(2);
        circle.setR(4);
        circle.setColor("red");
        shapes.add(circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setX(2);
        rectangle.setY(5);
        rectangle.setColor("black");
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        shapes.add(rectangle);
        copy(shapes, shapesCopy);

    }

    public static void copy(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.getClone());
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).equals(shapesCopy.get(i))) {
                System.out.println("shape is equal");
            } else {
                System.out.println("shape is not equal");
            }
        }
    }
}
