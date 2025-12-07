package lesson_17_homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LessonHomework {
    public static void main(String[] args) {
        when100AgeOld("29.08.1998");
        when100AgeOld("22.03.2001");
        System.out.println("-".repeat(50));

        printPositiveNumbers(new ArrayList<>(Arrays.asList(1, 3, -6, 3, -3, -5, 6)));
        printPositiveNumbers(new ArrayList<>(Arrays.asList(-3, -4, -6, -1)));
    }

    //Task 1
    static void when100AgeOld(String data) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDay = LocalDate.parse(data, format);
        LocalDate hundredYears = birthDay.plusYears(100);
        System.out.println(hundredYears);
    }

    //Task 2
    static void printPositiveNumbers(ArrayList<Integer> numbers) {
        Predicate<Integer> isPositive = n -> n > 0;
        numbers.removeIf(num -> !isPositive.test(num));
        System.out.println(numbers.isEmpty() ? "There no positive numbers in that array" : numbers);
    }
}
