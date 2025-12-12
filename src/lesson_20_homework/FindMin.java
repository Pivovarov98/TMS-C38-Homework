package lesson_20_homework;

import java.util.ArrayList;

public class FindMin extends Thread {
    private final ArrayList<Integer> arr;
    private int min;

    public FindMin(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {
        min = arr.getFirst();
        for (int num : arr) {
            if (min > num) min = num;
        }
    }
}
