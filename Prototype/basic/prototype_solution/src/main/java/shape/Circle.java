package main.java.shape;

public class Circle implements Component {
    private int radius;

    @Override
    public void render() {
        System.out.println("Render a Circle");
    }

    @Override
    public Component clone() {
        Circle circle = new Circle();
        circle.setRadius(this.radius);
        return circle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
