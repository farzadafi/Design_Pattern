package main;

public class Client {
    public static void main(String[] args) {
        // use from various constructor
        Address addressRequire = new Address("Iran", "Kerman", "Zarand", "Naseri");
        Address addressWithSubStreet = new Address("Iran", "Kerman", "Zarand", "Naseri", "Naser");
        Address addressWithPostalCode = new Address("Iran", "Kerman", "Zarand", "Naseri", "Naser", "1111");
        Address addressHouseNumber = new Address("Iran", "Kerman", "Zarand", "Naseri", "Naser", "1111", "1");

        //or use from setter
        Address addressRequire1 = new Address("Iran", "Kerman", "Zarand", "Naseri");
        addressRequire1.setSubStreet("Naser");
        addressRequire1.setPostalCode("1111");
        addressRequire1.setHouseNumber("1");
    }
}
