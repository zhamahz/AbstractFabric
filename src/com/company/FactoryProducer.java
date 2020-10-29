package com.company;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("FORM")){
            return new RoundedShapeFactory();
        }
        return null;
    }
}
