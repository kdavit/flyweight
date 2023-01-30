package org.example;

public class FlyweightDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black", "Yellow" };
    public static void main(String[] args) {

        for(int i=0; i < 30; ++i) {
            Rectangle rectangle = (Rectangle)ShapeFactory.getRectangle(getRandomColor());
            rectangle.setX(getRandomX());
            rectangle.setY(getRandomY());
            rectangle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}