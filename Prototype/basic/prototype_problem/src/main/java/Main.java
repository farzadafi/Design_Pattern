package main.java;

import main.java.shape.Circle;
import main.java.shape.Component;
import main.java.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        ContextMenu contextMenu = new ContextMenu();

        Circle circle = new Circle();
        circle.setRadius(10);
        Component duplicate = contextMenu.duplicate(circle);
        Circle circle1 = (Circle) duplicate;
        System.out.println(circle1.getRadius());

        Rectangle rectangle = new Rectangle(20, 30);
        duplicate = contextMenu.duplicate(rectangle);
        Rectangle rectangle1 = (Rectangle) duplicate;
        System.out.println("\n" + rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
    }
}
