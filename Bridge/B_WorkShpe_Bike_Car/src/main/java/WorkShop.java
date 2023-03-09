public abstract class WorkShop {
    abstract public void work();
}

class Produce extends WorkShop {

    @Override
    public void work() {
        System.out.println("Produced");
    }
}

class Assemble extends WorkShop {

    @Override
    public void work() {
        System.out.println("And Assembled");
    }
}
