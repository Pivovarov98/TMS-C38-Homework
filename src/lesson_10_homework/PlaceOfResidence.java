package lesson_10_homework;

public class PlaceOfResidence {
    String country;
    String city;
    String street;

    public PlaceOfResidence(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "\n   Country: " + country
                + "\n   City: " + city
                + "\n   Street: " + street;
    }
}