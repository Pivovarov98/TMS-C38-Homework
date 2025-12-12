package lesson_20_homework;

public class SelectionSorter extends Thread {
    private int[] arr;

    public SelectionSorter(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }

    }
}
