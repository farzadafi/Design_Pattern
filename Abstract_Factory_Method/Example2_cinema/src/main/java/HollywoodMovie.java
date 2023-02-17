public interface HollywoodMovie {
    void create();
}

class HollywoodComedy implements HollywoodMovie {

    @Override
    public void create() {
        System.out.println("This comedy movie created on hollywood");
    }
}
