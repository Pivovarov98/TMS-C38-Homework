package lesson_10_homework;

public class User implements Cloneable {
    int ID;
    String name;
    String surname;
    int bornYear;
    PlaceOfResidence address;

    public User(int ID, String name, String surname, int bornYear, PlaceOfResidence address) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.bornYear = bornYear;
        this.address = address;
    }

    void setNewAddress(String country, String city, String street) {
        this.address.country = country;
        this.address.city = city;
        this.address.street = street;
    }

    @Override
    public String toString() {
        return "User ID: " + ID
                + "\nName: " + name
                + "\nSurname: " + surname
                + "\nBorn: " + bornYear
                + "\nAddress: " + address.toString();
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User copy = (User) super.clone();
        copy.address = new PlaceOfResidence(this.address.country, this.address.city, this.address.street);
        return copy;
    }
}