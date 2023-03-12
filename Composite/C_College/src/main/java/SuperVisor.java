import java.util.ArrayList;
import java.util.List;

public class SuperVisor implements Faculty{
    private final String supervisorName;
    private final String departmentName;

    private final List<Faculty> facultyList;

    public SuperVisor(String supervisorName, String departmentName) {
        this.supervisorName = supervisorName;
        this.departmentName = departmentName;
        facultyList = new ArrayList<>();
    }

    public void add(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void remove(Faculty faculty) {
        facultyList.remove(faculty);
    }

    @Override
    public String getDetails() {
        return (supervisorName + " is the " + departmentName);
    }
}
