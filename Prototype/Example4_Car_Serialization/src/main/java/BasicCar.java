import java.io.*;

public class BasicCar implements Serializable{
    private String modelName;
    private Long price;

    public BasicCar(String modelName, Long price) {
        this.modelName = modelName;
        this.price = price;
    }

    public BasicCar copy(BasicCar original) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(original);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        return (BasicCar) in.readObject();
    }

    @Override
    public String toString() {
        return "BasicCar{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
