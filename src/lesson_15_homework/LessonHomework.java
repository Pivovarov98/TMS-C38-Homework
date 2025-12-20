package lesson_15_homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class LessonHomework {
    public static void main(String[] args) {
        //Task 1
        uniqueNumbers();
        System.out.println("-".repeat(50));

        //Task 2
        Zoo zoo = new Zoo();
        zoo.addAnimal();
        zoo.addAnimal();
        zoo.addAnimal();
        zoo.addAnimal();
        zoo.printAnimals();
        zoo.deleteAnimal();
        zoo.printAnimals();
        System.out.println("-".repeat(50));

        //Task 3
        List<Student> studentsList = new ArrayList<>();
        Student std1 = new Student("Egor", "66A", 2, Arrays.asList(4, 5, 3, 3, 2, 4));
        studentsList.add(std1);
        Student std2 = new Student("Dasha", "67B", 2, Arrays.asList(5, 3, 3, 3, 4));
        studentsList.add(std2);
        Student std3 = new Student("Gleb", "15B", 1, Arrays.asList(1, 2, 3, 5));
        studentsList.add(std3);
        Student std4 = new Student("Sasha", "54C", 3, Arrays.asList(1, 2, 3, 5, 2, 3, 2, 2));
        studentsList.add(std4);
        Student std5 = new Student("Stewie", "46B", 1, Arrays.asList(2, 3, 3, 5, 4, 4));
        studentsList.add(std5);
        System.out.println(studentsList);
        System.out.println("-".repeat(50));
        removeStudents(studentsList);
        System.out.println(studentsList);
        System.out.println("-".repeat(50));
        printStudents(studentsList, 3);

        //Task *
        MyArrayList<String> myList = new MyArrayList<>();

        myList.add("Egor");
        myList.add("Dasha");
        myList.add("Riko");

        System.out.println(myList.get(1));
        System.out.println(myList.contains("Egor"));

        myList.remove(1);
        System.out.println(myList.contains("Riko"));
        System.out.println(myList.get(1));

        myList.removeAll();
        System.out.println(myList.size());
    }

    //Task 1
    static void uniqueNumbers() {
        System.out.println("Enter the numbers");
        String str = scan().nextLine();
        List<String> values = Arrays.asList(str.split(" |, "));
        Set<String> setNumbers = new HashSet<>(values);
        System.out.println(setNumbers);
    }

    //Task 3
    static void removeStudents(List<Student> studentsList) {
        Iterator<Student> iterator = studentsList.iterator();

        while (iterator.hasNext()) {
            Student stud = iterator.next();
            if (stud.getAVG() < 3) {
                iterator.remove();
            } else {
                stud.nextCourse();
            }
        }
    }

    static void printStudents(List<Student> students, int course) {
        boolean isPrint = false;
        for (Student stud : students) {
            if (stud.getCourse() == course) {
                System.out.println(stud.getName());
                isPrint = true;
            }
        }

        if (!isPrint) {
            System.out.printf("There are no students in course %d on this list", course);
        }
    }

    static Scanner scan() {
        return new Scanner(System.in);
    }
}
