package lesson_15_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    List<String> animals = new ArrayList<>();

    public Zoo() {
    }

    void addAnimal() {
        System.out.println("Enter the animal you want to add to the zoo");
        String str = scan().nextLine();
        animals.addFirst(str);
    }

    void deleteAnimal() {
        animals.removeLast();
    }

    void printAnimals() {
        System.out.println(animals);
    }

    static Scanner scan() {
        return new Scanner(System.in);
    }
}
