package org.example;

import java.util.HashMap;

public class ShapeFactory {

    // Uncomment the compiler directive line and
    // javac *.java will compile properly.
    // @SuppressWarnings("unchecked")
    private static final HashMap rectangleMap = new HashMap();

    public static Shape getRectangle(String color) {
        Rectangle rectangle = (Rectangle) rectangleMap.get(color);

        if(rectangle == null) {
            rectangle = new Rectangle(color);
            rectangleMap.put(color, rectangle);
            System.out.println("Creating rectangle of color : " + color);
        }
        return (Shape) rectangle;
    }
}
