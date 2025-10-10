package lesson_4_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Enter array length ");
        int len = scan.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(0, 51);
        }

        outputOfElements(arr);
        findMinMaxValue(arr);
        findMinMaxIndex(arr);
        findZeroElements(arr);
        reverseArray();
        isArrayAscendingSequence();
        addingNumberToArray();
    }

    //Task 1
    public static void outputOfElements(int[] array) {
        System.out.print("Output of elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nReverse output of elements: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Task 2
    public static void findMinMaxValue(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
        }
        System.out.println("Min - " + min + " Max - " + max);
    }

    //Task3
    public static void findMinMaxIndex(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) minIndex = i;
            if (array[maxIndex] < array[i]) maxIndex = i;
        }
        System.out.println("Index of min value - " + minIndex + " Index of max value - " + maxIndex);
    }

    //Task 4
    public static void findZeroElements(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) counter++;
        }
        System.out.println(counter > 0 ? "The number of zeros in your array: " + counter : "There are no zeros in your array");
    }

    //Task 5
    public static void reverseArray() {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Enter array length for reverse ");
        int len = scan.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(0, 51);
        }
        System.out.println("Initial array: " + Arrays.toString(array));
        int variable;

        for (int i = 0; i < array.length / 2; i++) {
            variable = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = variable;
        }
        System.out.println("Reverse array: " + Arrays.toString(array));
    }

    //Task 6
    public static void isArrayAscendingSequence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length for ascending sequence chek ");
        int len = scan.nextInt();
        int[] array = new int[len];
        System.out.println("Enter number for array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("The numbers are not in ascending order");
                return;
            }
        }
        System.out.println("The numbers are in ascending order");
    }

    //Task 7* Немного усложнил задачу, если добавлять нужно не 1 как по заданию, а больше :)
    public static void addingNumberToArray() {
        int[] arr = new int[]{9, 9, 9}; //{9, 9, 9} и numberToAdd = 102 результат {1, 1, 0, 1}
        int numberToAdd = 102;
        int variable;

        if (arr[0] == 0) {
            System.out.println("Array can't start with 0");
            return;
        }

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] + numberToAdd < 10) {
                arr[i] += numberToAdd;
                break;
            }

            variable = numberToAdd;
            numberToAdd = (arr[i] + numberToAdd) / 10;
            arr[i] = (arr[i] + variable) % 10;

            if (i == 0 && numberToAdd > 0) {

                int[] newArr = new int[arr.length + 1];
                newArr[0] = numberToAdd;

                for (int k = 1; k < newArr.length; k++) {
                    newArr[k] = arr[k - 1];
                }
                System.out.println(Arrays.toString(newArr));
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}