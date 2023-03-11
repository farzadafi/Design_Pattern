public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "farzad", "developer");
        Employee dev2 = new Developer(101, "farzad", "developer");

        Manger engManager = new Manger("Farzad", 2_000_000_000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer(102, "farzad", "developer");

        Manger generalManager = new Manger("Farzad", 2_146_999_999);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}
