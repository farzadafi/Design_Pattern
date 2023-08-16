public class Client {
    public static void main(String[] args) {
        BasicCarCache carCache = new BasicCarCache();

        BasicCar basicCar = carCache.getBasicCar("nano");
        System.out.println(basicCar);

        BasicCar basicCar1 = carCache.getBasicCar("ford");
        System.out.println(basicCar1);
    }
}
