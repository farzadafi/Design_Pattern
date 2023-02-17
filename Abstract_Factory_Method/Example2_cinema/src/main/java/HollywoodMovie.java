public interface HollywoodMovie {
    void create();
}

class HollywoodComedy implements HollywoodMovie {

    @Override
    public void create() {
        System.out.println("This comedy movie created on hollywood");
    }
}

class HollywoodAction implements HollywoodMovie {

    @Override
    public void create() {
        System.out.println("This action movie created on hollywood");
    }
}
