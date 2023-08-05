package main;

public class Address {
    private String country; //require
    private String province; //require
    private String city; //require
    private String street; //require
    private String subStreet; //optional
    private String postalCode; //optional
    private String houseNumber; //optional

    public Address(String country, String province, String city, String street) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
    }

    public Address(String country, String province, String city, String street, String subStreet) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.subStreet = subStreet;
    }

    public Address(String country, String province, String city, String street, String subStreet, String postalCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.subStreet = subStreet;
        this.postalCode = postalCode;
    }

    public Address(String country, String province, String city, String street, String subStreet, String postalCode, String houseNumber) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.subStreet = subStreet;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSubStreet(String subStreet) {
        this.subStreet = subStreet;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
