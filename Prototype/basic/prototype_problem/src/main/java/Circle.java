package main.java;

public class Circle implements Component{
    private int radius;

    @Override
    public void render() {
        System.out.println("Render a Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
