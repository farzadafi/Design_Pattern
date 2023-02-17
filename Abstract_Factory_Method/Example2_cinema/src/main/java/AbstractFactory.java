public abstract class AbstractFactory {
    public abstract HollywoodMovie getHollywoodFactory(Genera genera);
    public abstract BollywoodMovie getBollywoodFactory(Genera genera);
}

enum Genera {
    COMEDY,
    ACTION
}

class HollywoodFactory extends AbstractFactory {

    @Override
    public HollywoodMovie getHollywoodFactory(Genera genera) {
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodFactory(Genera genera) {
        return null;
    }
}

