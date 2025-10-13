package lesson_3_homework;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        evenOrOdd();
        temperature();
        squaresOfNumber();
        sequenceOfNumbers();
        sumDigits();
    }

    //Task 1
    public static void evenOrOdd() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = scan.nextInt();
        System.out.println(num % 2 == 0 ? "Your number is even" : "Your number is odd");
    }

    //Task 2
    public static void temperature() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature outside ");
        int temp = scan.nextInt();
        System.out.println(temp >= -5 ? "It's warm outside" : temp >= -20 ? "It's normal outside" : "It's cold outside");
    }

    //Task 3
    public static void squaresOfNumber() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Square of " + i + " is " + i * i);
        }
    }

    //Task 4
    public static void sequenceOfNumbers() {
        int num = 7;

        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }
        System.out.println();
    }

    //Task 5*
    public static void sumDigits() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer ");

        if (!scan.hasNextInt()) {
            System.out.println("You have entered a non-integer number");
            return;
        }
        int sum = 0;
        int num = scan.nextInt();

        if (num < 1) {
            System.out.println("Your number is negative or 0");
            return;
        }

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers is " + sum);
    }
}