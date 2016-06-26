package Shapes;


public class Circle extends AbstractShape {

    private static String SHAPE_NAME = "Круг";
    private double radius;

    final static double pi = 3.1415926;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public String getShapeName() {
        return SHAPE_NAME;
    }
}
