package Shapes;

public class Square extends AbstractShape {

    private static String SHAPE_NAME = "Квадрат";
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    public String getShapeName() {
        return SHAPE_NAME;
    }
}
