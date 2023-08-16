package Prototype.Car_Clone.src.main.java;

import Prototype.Car_Clone.src.main.java.car.BasicCar;

public class CarCloneClient {
    public static void main(String[] args) {
        BasicCarCache carCache = new BasicCarCache();

        BasicCar basicCar = carCache.getBasicCar("nano");
        System.out.println(basicCar);

        BasicCar basicCar1 = carCache.getBasicCar("ford");
        System.out.println(basicCar1);
    }
}
