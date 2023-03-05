public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();

        Turkey turkey = new WildTurkey();
        turkey.gobble();

        Duck adapterTurkey = new AdapterTurkey(turkey);
        System.out.println("\nadapter:");
        adapterTurkey.quack();
        adapterTurkey.fly();
    }
}
