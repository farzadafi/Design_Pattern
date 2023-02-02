public interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }

//    public double calculateRectangleArea(Rectangle rectangle) {
//        return rectangle.length * rectangle.width;
//    }
//
//    public double calculateCircleArea(Circle circle) {
//        return (22 / 7) * circle.radius * circle.radius;
//    }
}