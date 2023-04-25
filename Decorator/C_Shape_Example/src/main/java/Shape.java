public interface Shape {
    void draw();
}

class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}