package lesson_9_homework;

public class Animal implements Cloneable {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("Animal: %s \nAge: %d \n\n", name, age);
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }
}
