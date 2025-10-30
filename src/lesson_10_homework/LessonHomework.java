package lesson_10_homework;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Task 1
        Person Egor = new Person("Egor", "Pivovarov", 27, "working in reconciliation department");
        Person Egor2 = new Person("Egor", "Pivovarov", 27, "working in reconciliation department");
        Person Dasha = new Person("Dasha", "Korbut", 24, "working as frontend developer");

        System.out.println(Egor);
        System.out.println(Dasha);
        System.out.println("-".repeat(50));

        System.out.println("Is Egor and Dasha are equals: " + Egor.equals(Dasha));
        System.out.println("Is Egor and Egor2 are equals: " + Egor.equals(Egor2));
        System.out.println("-".repeat(50));

        System.out.println(Egor.hashCode());
        System.out.println(Egor2.hashCode());
        System.out.println(Dasha.hashCode());
        System.out.println("-".repeat(50));

        //Task 2*
        User[] users = new User[]{
                new User(1, "Egor", "Pivovarov", 1998, new PlaceOfResidence("Belarus", "Minsk", "Gorovtsa")),
                new User(2, "Dasha", "Korbut", 2001, new PlaceOfResidence("Belarus", "Minskay obl.", "Lesnaya")),
                new User(3, "Archil", "Sikharulidze", 1988, new PlaceOfResidence("Georgia", "Tbilisi", "Iuri Gagarini St"))
        };

        System.out.println("What type of cloning do you want?" + "\n1 - cloning | 2 - deep cloning");
        int choiceCloningType;
        int choiceUser;
        User clonUser = null;
        User original = null;

        while (true) {
            choiceCloningType = new Scanner(System.in).nextInt();

            if (choiceCloningType != 1 && choiceCloningType != 2) {
                System.out.println("Incorrect enter. Enter 1 for cloning or 2 for deep cloning");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Enter user ID for cloning");
            choiceUser = new Scanner(System.in).nextInt();

            for (User user : users) {
                if (user.ID == choiceUser) {
                    original = user;
                    if (choiceCloningType == 1) {
                        clonUser = user.clone();
                    } else {
                        clonUser = user.deepClone();
                    }
                    break;
                }
            }
            if(clonUser != null) break;
            System.out.println("There is no user under this ID yet");
        }

        userInfoChek(original, clonUser);
        clonUser.setNewAddress("France", "London", "Meero St");
        userInfoChek(original, clonUser);

    }

    static void userInfoChek(User user1, User user2) {
        System.out.println("-".repeat(50));
        System.out.println(user1.toString());
        System.out.println();
        System.out.println(user2.toString());
        System.out.println("-".repeat(50));
    }
}