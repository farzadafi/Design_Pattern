public class Person {

    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String username;
        private String password;

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstname = firstname;
            person.lastname = lastname;
            person.username = username;
            person.password = password;
            return person;
        }
    }
}
