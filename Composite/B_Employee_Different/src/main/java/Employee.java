public interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private final long id;
    private final String name;
    private final String position;

    public Developer(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }
}