package com.company;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory formFactory = FactoryProducer.getFactory("FORM");

        Shape shape3 = formFactory.getShape("ROUNDED SQUARE");
        shape3.draw();

        Shape shape4 = formFactory.getShape("rounded rectangle");
        shape4.draw();
    }
}
