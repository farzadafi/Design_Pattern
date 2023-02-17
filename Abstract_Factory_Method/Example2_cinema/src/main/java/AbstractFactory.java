public abstract class AbstractFactory {
    public abstract HollywoodMovie getHollywoodFactory(Genera genera);
    public abstract BollywoodMovie getBollywoodFactory(Genera genera);
}

enum Genera {
    COMEDY,
    ACTION
}

