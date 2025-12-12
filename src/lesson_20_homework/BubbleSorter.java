package lesson_20_homework;

public class BubbleSorter extends Thread {
    private int[] arr;

    public BubbleSorter(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                int leftElement = arr[i];
                int rightElement = arr[i + 1];

                if (rightElement < leftElement) {
                    int variable = rightElement;

                    arr[i + 1] = leftElement;
                    arr[i] = variable;
                    isSorted = false;
                }
            }
        }
    }
}
