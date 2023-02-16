public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        assert shapeFactory != null;
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        assert colorFactory != null;
        Color color1 = colorFactory.getColor("GREEN");
        color1.fill();

        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();

        Color color3 = colorFactory.getColor("RED");
        color3.fill();
    }
}
