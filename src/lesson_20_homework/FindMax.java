package lesson_20_homework;

import java.util.ArrayList;

public class FindMax extends Thread {
    private final ArrayList<Integer> arr;
    private int max;

    public FindMax(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        max = arr.getFirst();
        for (int num : arr) {
            if (max < num) max = num;
        }
    }
}
