package org.example.java8.IOC;

public class DrawingShapeWithIoc {

    private Shape shape;

    public DrawingShapeWithIoc(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }
}
