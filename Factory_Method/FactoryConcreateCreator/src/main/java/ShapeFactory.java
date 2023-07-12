public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        if (shapeType == null)
            return shape;
        switch (shapeType) {
            case SQUARE -> shape = new Square();
            case CIRCLE -> shape = new Circle();
            case RECTANGLE -> shape = new Rectangle();
        }
        return shape;
    }
}
