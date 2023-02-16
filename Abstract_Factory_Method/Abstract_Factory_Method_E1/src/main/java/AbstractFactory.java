public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if(shape == null )
            return null;
        if(shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
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
    Shape getShape(String shape) {
        return null;
    }
}