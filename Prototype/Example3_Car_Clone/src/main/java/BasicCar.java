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

class Nano extends BasicCar {

    public Nano(String modelName, Long price) {
        super(modelName, price);
    }
}

class Ford extends BasicCar {

    public Ford(String modelName, Long price) {
        super(modelName, price);
    }
}
