public interface BollywoodMovie {
    void create();
}

class BollywoodComedy implements BollywoodMovie {

    @Override
    public void create() {
        System.out.println("This comedy movie created in Bollywood!");
    }
}

class BollywoodAction implements BollywoodMovie {

    @Override
    public void create() {
        System.out.println("This action movie created in Bollywood!");
    }
}
