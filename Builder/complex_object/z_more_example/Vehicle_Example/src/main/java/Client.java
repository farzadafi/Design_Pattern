package Builder.complex_object.z_more_example.Vehicle_Example.src.main.java;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        //making a car
        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        //making a motor
        director.construct(motorBuilder);
        Product product2 = motorBuilder.getVehicle();
        product2.show();
    }
}
