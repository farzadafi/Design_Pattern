public class AdapterTurkey implements Duck{

    Turkey turkey;

    public AdapterTurkey(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0;i<3;i++)
            turkey.fly();
    }
}
