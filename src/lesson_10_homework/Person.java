package lesson_10_homework;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    int age;
    String position;

    Person(String name, String surname, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "My name is: " + name
                + "\nSurname: " + surname
                + "\nAge: " + age
                + "\nPosition: " + position + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;

        return this.name == person.name
                && this.surname == person.surname
                && this.age == person.age
                && this.position == person.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, position);
    }
}