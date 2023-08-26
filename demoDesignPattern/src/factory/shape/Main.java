package factory.shape;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("squere");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("gfgjkdghdjf");
        shape3.draw();
    }
}
