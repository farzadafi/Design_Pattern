public interface Faculty {
    String getDetails();
}

class Professor implements Faculty {
    private int id;
    private final String name;
    private final String position;

    public Professor(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public String getDetails() {
        return (name +  " is the " + position);
    }
}
