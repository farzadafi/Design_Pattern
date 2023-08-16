package Prototype.Car_Clone.src.main.java.car;

public class BasicCar implements Cloneable {
    private String modelName;
    private Long price;

    public BasicCar(String modelName, Long price) {
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public BasicCar clone() {
        try {
            return (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}