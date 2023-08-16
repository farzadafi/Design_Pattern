package Builder.construction_process.z_more_example.Person_Builder.src.main.java;

public class Client {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstname("farzad")
                .lastname("afshar")
                .username("farzadafi")
                .password("naser")
                .build();
        System.out.println(person);
    }
}
