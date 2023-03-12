import java.util.List;

public class Client {
    public static void main(String[] args) {
        SuperVisor technologyDean = new SuperVisor("Dr. Mike", "Dean of Technology");
        SuperVisor chairOfMathDepartment = new SuperVisor("Dr. John", "Chair of Math Department");
        SuperVisor chairOfComputerScienceDepartment = new SuperVisor("Dr. Ian", "Chair Of CS Department");

        Professor mathProf1 = new Professor(1, "Adjunct", "302");
        Professor mathProf2 = new Professor(2, "Associate", "303");

        Professor cseProf1 = new Professor (1, "Adjunct", "507");
        Professor cseProf2 = new Professor (2, "Professor", "508");
        Professor cseProf3 = new Professor (3, "Professor", "509");

        technologyDean.add(chairOfMathDepartment );
        technologyDean.add(chairOfComputerScienceDepartment );

        /* Professors of Mathematics directly reports to chair of math*/
        chairOfMathDepartment.add(mathProf1);
        chairOfMathDepartment.add(mathProf2);

        /*Professors of  Computer Sc. directly reports to chair of computer science*/
        chairOfComputerScienceDepartment.add(cseProf1);
        chairOfComputerScienceDepartment.add(cseProf2);
        chairOfComputerScienceDepartment.add(cseProf3);

        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO ***");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(technologyDean.getDetails());
        List<Faculty> chairs=technologyDean.getFacultyList();

        for (Faculty chair : chairs) {
            System.out.println("\t" + chair.getDetails());
        }

        List<Faculty> mathProfessors= chairOfMathDepartment.getFacultyList();
        for (Faculty mathProfessor : mathProfessors) {
            System.out.println("\t\t" + mathProfessor.getDetails());
        }

        List<Faculty> cseProfessors= chairOfComputerScienceDepartment.getFacultyList();
        for (Faculty cseProfessor : cseProfessors) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }

        chairOfComputerScienceDepartment.remove(cseProf2);

        System.out.println("\n After CSE Professor2 leaving the organization- CSE department has following faculty:");

        cseProfessors = chairOfComputerScienceDepartment.getFacultyList();
        for (Faculty cseProfessor : cseProfessors) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }
    }
}
