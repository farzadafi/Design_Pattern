public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType == null)
            return null;
        else if (shapeType.equalsIgnoreCase("CIRCLE"))
            shape = new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            shape = new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            shape = new Square();

        return shape;
    }
}
