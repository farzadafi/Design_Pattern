package main;

public class Client {
    public static void main(String[] args) {
        //require attribute
        Address addressRequire = Address.builder()
                .country("Iran")
                .province("Kerman")
                .city("Zarand")
                .street("Naseri")
                .build();

        //with optional attribute
        Address addressOptional = Address.builder()
                .country("Iran")
                .province("Kerman")
                .city("Zarand")
                .street("Naseri")
                .houseNumber("1")
                .build();
    }
}
