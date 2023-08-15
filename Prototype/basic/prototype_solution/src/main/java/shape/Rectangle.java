package main.java.shape;

public class Rectangle implements Component {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void render() {
        System.out.println("Render a Rectangle");
    }

    @Override
    public Component clone() {
        return new Rectangle(this.length, this.width);
    }
}
