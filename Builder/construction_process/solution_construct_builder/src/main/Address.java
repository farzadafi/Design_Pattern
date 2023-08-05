package main;

public class Address {
    private String country; //require
    private String province; //require
    private String city; //require
    private String street; //require
    private String subStreet; //optional
    private String postalCode; //optional
    private String houseNumber; //optional

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String country;
        private String province;
        private String city;
        private String street;
        private String subStreet;
        private String postalCode;
        private String houseNumber;

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder province(String province) {
            this.province = province;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder subStreet(String subStreet) {
            this.subStreet = subStreet;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.country = country;
            address.province = province;
            address.city = city;
            address.street = street;
            address.subStreet = subStreet;
            address.postalCode = postalCode;
            address.houseNumber = houseNumber;
            return address;
        }
    }
}
