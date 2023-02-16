public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryName choice) {
        AbstractFactory abstractFactory = null;
        switch (choice) {
            case COLOR -> abstractFactory = new ColorFactory();
            case SHAPE -> abstractFactory = new ShapeFactory();

        }
        return abstractFactory;
    }
}

enum FactoryName {
    SHAPE,
    COLOR
}
