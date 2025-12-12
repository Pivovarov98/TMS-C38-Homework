package lesson_20_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LessonHomework {

    public static void main(String[] args) throws InterruptedException {
        //Task 1
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter number or \"0\" to exit");
        int num;

        while ((num = scan().nextInt()) != 0) {
            array.add(num);
        }

        FindMin minThr = new FindMin(array);
        FindMax maxThr = new FindMax(array);

        minThr.start();
        maxThr.start();

        minThr.join();
        maxThr.join();

        int min = minThr.getMin(), max = maxThr.getMax();
        System.out.printf("Min: %d\nMax: %d\n", min, max);
        System.out.println("-".repeat(50));

        //Task 2
        int[] bubbleSort = new int[]{5, 6, 3, 7, 1, 2, 4};
        int[] insertionSort = new int[]{9, 7, 3, 4, 5, 1, 2};
        int[] selectionSort = new int[]{6, 3, 8, 7, 9, 5, 1, 2};

        BubbleSorter bubble = new BubbleSorter(bubbleSort);
        InsertionSorter insertion = new InsertionSorter(insertionSort);
        SelectionSorter selection = new SelectionSorter(selectionSort);

        bubble.start();
        insertion.start();
        selection.start();

        bubble.join();
        insertion.join();
        selection.join();

        bubbleSort = bubble.getArr();
        insertionSort = insertion.getArr();
        selectionSort = selection.getArr();

        System.out.println("Bubble sort: " + Arrays.toString(bubbleSort) +
                           "\nInsertion sort: " + Arrays.toString(insertionSort) +
                           "\nSelection sort: " + Arrays.toString(selectionSort));
    }

    static Scanner scan() {
        return new Scanner(System.in);
    }
}
