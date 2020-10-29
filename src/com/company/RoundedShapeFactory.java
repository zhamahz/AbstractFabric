package com.company;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String form) {
        if (form == null) {
            return null;
        }
        if (form.equalsIgnoreCase("ROUNDED RECTANGLE")) {
            return new RoundedRectangle();

        } else if (form.equalsIgnoreCase("ROUNDED SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }
}
