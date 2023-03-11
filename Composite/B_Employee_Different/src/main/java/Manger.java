import java.util.ArrayList;
import java.util.List;

public class Manger implements Employee{

    private final List<Employee> employees = new ArrayList<>();

    private final String name;
    private final double salary;

    public Manger(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name " + getName());
        System.out.println("Salary " + getSalary());

        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
