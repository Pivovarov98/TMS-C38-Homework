package lesson_17_homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LessonHomework {
    public static void main(String[] args) {
        when100AgeOld("29.08.1998");
        when100AgeOld("22.03.2001");
        System.out.println("-".repeat(50));

        printPositiveNumbers(new ArrayList<>(Arrays.asList(1, 3, -6, 3, -3, -5, 6)));
        printPositiveNumbers(new ArrayList<>(Arrays.asList(-3, -4, -6, -1)));

        bynToUsdWithFunction("30 BYN");
        bynToUsdWithFunction("50 BYN");

        bynToUsdWithConsumer("13 BYN");
        bynToUsdWithConsumer("27 BYN");

        reverseStringFromConsole();
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

    //Task 3
    static void bynToUsdWithFunction(String amount){
        double rate = 3.0;

        Function<String, Double> bynToUsd = str -> {
            String amountStr = str.split(" ")[0];
            double byn = Double.parseDouble(amountStr);
            return byn / rate;
        };

        System.out.println(bynToUsd.apply(amount) + " USD");
    }

    //Task 4
    static void bynToUsdWithConsumer(String amount){
        double rate = 3.0;

        Consumer<String> bynToUsd = str -> {
            String amountStr = str.split(" ")[0];
            double byn = Double.parseDouble(amountStr);
            double usd = byn / rate;
            System.out.println(usd + " USD");
        };

        bynToUsd.accept(amount);
    }

    //Task 5
    static void reverseStringFromConsole(){
        Supplier<String> reverseString = () -> {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String i = s.nextLine();
            return new StringBuilder(i).reverse().toString();
        };

        System.out.println("Reverse string: " + reverseString.get());
    }
}
