public interface Turkey {
    void gobble();
    void fly();
}

class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
