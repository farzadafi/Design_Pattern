public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "farzad Afshar", "Senior Developer");
        Employee dev2 = new Developer(101, "farzad Afshar", "FullStack Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager(200, "farzad Afshar", "Seo Manager");
        Employee man2 = new Manager(201, "farzad Afshar", "Devops Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
