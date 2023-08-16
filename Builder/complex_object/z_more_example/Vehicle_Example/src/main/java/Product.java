package Builder.complex_object.z_more_example.Vehicle_Example.src.main.java;

import java.util.LinkedList;

public class Product {

    private final LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n product completed as below");

        for (String s:parts
             ) {
            System.out.println(s);
        }
    }
}
