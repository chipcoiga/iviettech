package factory.shape;

import factory.shape.impl.Circle;
import factory.shape.impl.Rectangle;
import factory.shape.impl.Squere;

public class ShapeFactory {

    public static Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        }

        if ("squere".equals(type)) {
            return new Squere();
        }

        if ("rectangle".equals(type)) {
            return new Rectangle();
        }

        throw new RuntimeException("Shape type not exist");
    }
}
