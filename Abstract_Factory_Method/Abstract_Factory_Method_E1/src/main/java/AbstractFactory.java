public abstract class AbstractFactory {
    abstract Color getColor(ColorType colorType);

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
    Color getColor(ColorType colorType) {
        return null;
    }

}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(ColorType colorType) {
        Color color = null;

        switch (colorType) {
            case RED -> color = new Red();
            case BLUE -> color = new Blue();
            case GREEN -> color = new Green();
        }

        return color;
    }

    @Override
    Shape getShape(ShapeType shapeType) {
        return null;
    }
}