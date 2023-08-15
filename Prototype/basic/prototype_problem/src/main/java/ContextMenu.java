package main.java;

public class ContextMenu {
    public void duplicate(Component component) {
        if( component instanceof Circle){
            Circle source = (Circle) component;
            Circle target = new Circle();
            target.setRadius(source.getRadius());
        }
    }
}
