package factory.shape.impl;

import factory.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Circle");
    }
}
