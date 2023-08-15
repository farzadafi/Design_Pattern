package main.java;

import main.java.shape.Circle;
import main.java.shape.Component;
import main.java.shape.Rectangle;

// this class a menu that has some utility methods, for example duplicate, copy, paste or ...
public class ContextMenu {
    public Component duplicate(Component component) {
        if (component instanceof Circle source) { //if is true, create a Circle with name source, and use with that :)
            Circle target = new Circle();
            target.setRadius(source.getRadius());
            component = target;
        }
        if (component instanceof Rectangle source) {
            component = new Rectangle(source.getLength(), source.getWidth());
        }
        return component;
    }
}
