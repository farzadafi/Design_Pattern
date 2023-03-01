import java.io.*;

public class BasicCar {
    private String modelName;
    private Long price;

    public BasicCar(String modelName, Long price) {
        this.modelName = modelName;
        this.price = price;
    }


    @Override
    public String toString() {
        return "BasicCar{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
