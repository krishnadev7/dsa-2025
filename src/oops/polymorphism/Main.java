package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes triangle = new Triangle();

        triangle.area();
        shape.area();
        square.area();
        circle.area();
    }
}
