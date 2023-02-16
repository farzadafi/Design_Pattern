public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("call draw method for Rectangle class");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("call draw method for Square class");

    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("call draw method for Circle class");
    }
}
