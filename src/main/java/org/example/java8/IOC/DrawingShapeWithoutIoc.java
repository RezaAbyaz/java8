package org.example.java8.IOC;

public class DrawingShapeWithoutIoc {

    private Shape shape;

    public DrawingShapeWithoutIoc() {
        shape = new Square();// we must select what shape here

        // OR

        shape = new Triangle();
    }

    public void draw(){
        shape.draw();
    }
}
