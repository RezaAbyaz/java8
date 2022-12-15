package org.example.java8.IOC;

public class TestIOC {

    public static void main(String[] args) {

        Shape shape = new Triangle();
        DrawingShapeWithIoc withIoc = new DrawingShapeWithIoc(shape);
        withIoc.draw();

        DrawingShapeWithoutIoc withoutIoc = new DrawingShapeWithoutIoc();
        withoutIoc.draw();

        A a = new B();
        C c = new C(a);
        c.calculate();
    }
}
