public class Client {
    public static void main(String[] args) {
        Vehicle carVehicle = new Car(new Produce(), new Assemble());
        carVehicle.manufacture();

        System.out.println();
        Vehicle bikeVehicle = new Bike(new Produce(), new Assemble());
        bikeVehicle.manufacture();
    }
}
