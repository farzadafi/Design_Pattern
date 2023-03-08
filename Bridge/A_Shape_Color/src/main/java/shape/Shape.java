package shape;

import color.Color;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract void applyColor();
    public abstract void draw();
}
