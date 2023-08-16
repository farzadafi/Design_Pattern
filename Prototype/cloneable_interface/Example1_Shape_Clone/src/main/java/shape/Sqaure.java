package shape;

public class Sqaure extends Shape {

    public Sqaure() {
        type = "Square";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}