import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BasicCar basicCar = new BasicCar("ford", 4000L);
        System.out.println(basicCar.hashCode());

        BasicCar basicCar1 = basicCar.copy(basicCar);
        System.out.println(basicCar1.hashCode());
    }
}
