public abstract class Vehicle {
    private WorkShop workShop1;
    private WorkShop workShop2;

    public Vehicle(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    public WorkShop getWorkShop1() {
        return this.workShop1;
    }

    public WorkShop getWorkShop2() {
        return this.workShop2;
    }

    abstract public void manufacture();
}
