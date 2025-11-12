package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonHomework {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        String abbreviation = scan().nextLine();
        printAbbreviation(abbreviation);

        System.out.println("Enter an info of your Email, phone number and contract number: ");
        String info = scan().nextLine();
        findPrintInfo(info);

    }

    //Task 1
    public static void printAbbreviation(String abbreviation) {
        Pattern pattern = Pattern.compile("\\b(\\p{Lu}{2,6})\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(abbreviation);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-".repeat(50));
    }

    //Task 2*
    public static void findPrintInfo(String info) {
        String[] regex = new String[]{
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}",
                "\\b\\d{4}-\\d{4}-\\d{2}\\b",
                "\\+\\(\\d{2}\\)\\d{7}"
        };

        for (int i = 0; i < regex.length; i++) {
            Pattern pattern = Pattern.compile(regex[i]);
            Matcher matcher = pattern.matcher(info);

            while (matcher.find()) {
                switch (i) {
                    case 0 -> System.out.println("Email: " + matcher.group());
                    case 1 -> System.out.println("Document number: " + matcher.group());
                    case 2 -> System.out.println("Phone number: " + matcher.group());
                }
            }
        }
        System.out.println("-".repeat(50));
    }

    public static Scanner scan() {
        return new Scanner(System.in);
    }

}
