public class Client {
    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory(FactoryType.HOLLYWOOD);

        HollywoodMovie hollywoodComedy = hollywoodFactory.getHollywoodFactory(Genera.COMEDY);
        hollywoodComedy.create();

        HollywoodMovie hollywoodAction = hollywoodFactory.getHollywoodFactory(Genera.ACTION);
        hollywoodAction.create();

        System.out.println();
        //-->Bollywood
        AbstractFactory bollywoodFactory = FactoryProducer.getFactory(FactoryType.BOLLYWOOD);

        BollywoodMovie bollywoodComedy = bollywoodFactory.getBollywoodFactory(Genera.COMEDY);
        bollywoodComedy.create();

        BollywoodMovie bollywoodAction = bollywoodFactory.getBollywoodFactory(Genera.ACTION);
        bollywoodAction.create();
    }
}
