package shape;

import color.Color;

public class Circle extends Shape{


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        getColor().applyColor();
    }

    @Override
    public void draw() {
        System.out.println("draw " + getColor() + " Circle");
    }
}
