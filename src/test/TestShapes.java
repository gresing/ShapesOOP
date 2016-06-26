package test;

import Shapes.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class TestShapes {
    @Test
    public void testCircle() {
        Circle c = new Circle(5);
        assertEquals(78.539815, c.getArea());
        assertEquals(31.415926, c.getPerimeter());
    }

    @Test
    public void testSquare() {
        Square s = new Square(5);
        assertEquals(25.0, s.getArea());
        assertEquals(20.0, s.getPerimeter());
    }

    @Test
    public void testTriangle() {
        Triangle t = new Triangle(5, 5, 5);
        assertEquals(10.825317547305483, t.getArea());
        assertEquals(15.0, t.getPerimeter());
    }

    @Test
    public void polyTestAbstractClass() {
        List<AbstractShape> listOfAbstractShapes = new ArrayList<>();
        listOfAbstractShapes.add(new Circle(5));
        listOfAbstractShapes.add(new Square(5));
        listOfAbstractShapes.add(new Circle(10));
        listOfAbstractShapes.add(new Triangle(5, 5, 5));

        for (AbstractShape as : listOfAbstractShapes) {
            System.out.println("Название фигуры - " + as.getShapeName() + ", периметр фигуры = " + as.getPerimeter());
            System.out.println("Название фигуры - " + as.getShapeName() + ", площадь фигуры = " + as.getArea());
        }


    }

    @Test
    public void polyTestInterface() {
        List<Shape> listOfInterface = new ArrayList<>();
        listOfInterface.add(new Circle(10));
        listOfInterface.add(new Square(15));
        listOfInterface.add(new Circle(20));
        listOfInterface.add(new Triangle(10, 10, 10));

        for (Shape shape : listOfInterface) {
            System.out.println("Название фигуры - " + shape.getShapeName() + ", периметр фигуры = " + shape.getPerimeter());
            System.out.println("Название фигуры - " + shape.getShapeName() + ", площадь фигуры = " + shape.getArea());
        }
    }
}
