package lesson_20_homework;

public class InsertionSorter extends Thread {
    private int[] arr;

    public InsertionSorter(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int previousNumber = i - 1;

            while (previousNumber >= 0 && arr[previousNumber] > currentNumber) {
                arr[previousNumber + 1] = arr[previousNumber];
                previousNumber--;
            }
            arr[previousNumber + 1] = currentNumber;
        }
    }
}
