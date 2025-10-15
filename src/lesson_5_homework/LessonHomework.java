package lesson_5_homework;

import java.util.Random;
import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        process2DArray();
        System.out.println("---------------------------------");
        chessBoard();
        System.out.println("---------------------------------");
        System.out.println("Enter number of rows: ");
        int row = scan.nextInt();
        System.out.println("Enter number of columns: ");
        int column = scan.nextInt();
        snakePrintArray(row, column);
    }

    //Task 1
    public static void process2DArray(){
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        int[][] numbers = new int[3][5];
        int sumOfArrayNumbers = 0;

        for (int i = 0; i < numbers.length ; i++){
            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = rng.nextInt(1, 20);
            }
        }
        print2DArray(numbers);
        System.out.println("Enter number to add in array value: ");

        for (int i = 0; i < numbers.length ; i++){
            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] += scan.nextInt();
                sumOfArrayNumbers += numbers[i][j];
            }
        }
        print2DArray(numbers);
        System.out.println("Sum of all values in array: " + sumOfArrayNumbers);
    }

    //Task 2
    public static void chessBoard(){
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length ; i++){
            for (int j = 0; j < chessBoard[i].length; j++){
                chessBoard[i][j] = (i + j) % 2 == 0 ? "W" : "B";
            }
        }
        print2DArrayStr(chessBoard);
    }

    //Task 3*

    public static void snakePrintArray(int n, int m) {
        int numToAdd = 0;
        int[][] snakeArr = new int[n][m];

        for (int i = 0; i < snakeArr.length ; i++){
            if(i % 2 == 0){
                for (int j = 0; j < snakeArr[i].length; j++){
                    snakeArr[i][j] += numToAdd;
                    numToAdd++;
                }
                continue;
            }

            for (int j = snakeArr[i].length - 1; j >= 0; j--){
                snakeArr[i][j] += numToAdd;
                numToAdd++;
            }
        }
        print2DArray(snakeArr);
    }


    //Методы для вывода массивов
    public static void print2DArray(int[][] arr){
        int maxNumLength = String.valueOf(arr.length * arr[0].length).length() + 1;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%" + maxNumLength + "d", anInt);
            }
            System.out.println();
        }
    }

    public static void print2DArrayStr(String[][] arr){
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
