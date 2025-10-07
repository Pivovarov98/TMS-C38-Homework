package lesson_1_homework;

public class LessonHomework {
    public static void main(String[] args) {

        autoCalculateNumbers(2, 16);
        sumDigitIn2xNumber(26);
        sumDigitIn3xNumber(126);
        roundDigit(2.5);
        roundDigit(5.49);
        calculationResult(21, 8);
        swapVariable(28, 9);
    }

    //Task 1
    public static void autoCalculateNumbers(int b, int c) {
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }

    //Task 2
    public static void sumDigitIn2xNumber(int num) {
        int sum = 0;
        sum += num % 10;
        num = num /10;
        sum += num % 10;
        System.out.println(sum);
    }

    //Task 3
    public static void sumDigitIn3xNumber(int num) {
        int sum = 0;
        sum += num % 10;
        num = num /10;
        sum += num % 10;
        num = num /10;
        sum += num % 10;
        System.out.println(sum);
    }

    //Task 4
    public static void roundDigit(double num) {
        double roundNumber = num + 0.5;
        System.out.println((int) (roundNumber));
    }

    //Task 5
    public static void calculationResult(int q, int w) {
        System.out.printf("The result of division is %d and its remainder is %d \n", q / w, q % w);
    }

    //Task 6*
    public static void swapVariable(int a, int b) {
        System.out.printf("The start variables is a = %d and b = %d \n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After some magic now variables is a = %d and b = %d \n", a, b);
    }
}

