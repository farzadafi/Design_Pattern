package Prototype.copy_constructor.Employee_CopyConstructor.src.main.java;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date startDate;

    //copy constructor
    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = new Date(employee.startDate.getTime());
    }

    //all args constructor
    public Employee(int id, String name, Date startDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
    }

    //no args constructor
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
