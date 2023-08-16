package Prototype.copy_constructor.Employee_CopyConstructor.src.main.java;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Employee orginalEmployee = new Employee(1, "farzad", new Date());
        System.out.println("original Employee is: " + orginalEmployee);

        Employee copyEmployee = new Employee(orginalEmployee);
        System.out.println("\ncopy Employee is: " + copyEmployee);
    }
}
