package Test;

public class Test {
    public static void main(String[] args) {
        byte a = 52;
        int b = 543;
        String str = "Патериомок";

        int sum = getSum(a, b);
        System.out.println("Сумма ваших чисел = " + sum + " " + str);

        sum = getSum(a, sum);
        str = newWord(str);
        System.out.println("Сумма ваших новых чисел = " + sum + " " + str);
    }

    public static int getSum(byte num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String newWord(String str) {
        str = "Это новый я!";
        return str;
    }
}
