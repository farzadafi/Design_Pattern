public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Demo");

        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorEx_1 ex1 = new ConcreteDecoratorEx_1();
        ex1.setComponent(concreteComponent);
        ex1.doJob();

        System.out.println();
        ConcreteDecoratorEx_2 ex2 = new ConcreteDecoratorEx_2();
        ex2.setComponent(ex1);
        ex2.doJob();
    }
}
