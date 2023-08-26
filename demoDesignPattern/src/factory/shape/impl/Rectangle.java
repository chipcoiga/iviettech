package factory.shape.impl;

import factory.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Rectangle");
    }
}
