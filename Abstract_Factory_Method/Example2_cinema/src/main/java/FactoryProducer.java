public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        AbstractFactory abstractFactory = null;
        switch (factoryType) {
            case BOLLYWOOD -> abstractFactory = new BollywoodFactory();
            case HOLLYWOOD -> abstractFactory = new HollywoodFactory();
        }
        return abstractFactory;
    }
}

enum FactoryType {
    BOLLYWOOD,
    HOLLYWOOD
}
