package model;

public class Address {
    private String city;
    private String country;
    private String street;
    private int postalCode;

    public Address(String city, String country, String street, int postalCode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
               "city='" + city + '\'' +
               ", country='" + country + '\'' +
               ", street='" + street + '\'' +
               ", postalCode=" + postalCode +
               '}';
    }
}
