public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(ShapeType shapeType);
}

enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE
}

enum ColorType {
    GREEN,
    RED,
    BLUE
}

class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE -> shape = new Circle();
            case SQUARE -> shape = new Square();
            case RECTANGLE -> shape = new Rectangle();
        }
        return shape;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null)
            return null;

        if(color.equalsIgnoreCase("RED"))
            return new Red();
        else if(color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if(color.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;
    }

    @Override
    Shape getShape(ShapeType shapeType) {
        return null;
    }
}