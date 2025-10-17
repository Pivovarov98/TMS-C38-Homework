package lesson_6_homework;

import java.util.Scanner;

//Task 2*
public class ATM {
    int valueTwenty;
    int valueFifty;
    int valueHundred;

    void refillATM(int numberOfTwenty, int numberOfFifty, int numberOfHundred) {
        valueTwenty += numberOfTwenty;
        valueFifty += numberOfFifty;
        valueHundred += numberOfHundred;
    }

    void checkATMBalance() {
        System.out.println("\nRemaining denomination:\n20's: " + valueTwenty
                + "\n50's: " + valueFifty
                + "\n100's: " + valueHundred);
    }

    void withdrawalSuccessCheck(int funds) {
        System.out.println(withdrawalFunds(funds)
                ? "\nThe withdrawal was successful! Don’t forget to take your card and cash."
                : "\nYou exit! Don’t forget to take your card.");
    }

    boolean withdrawalFunds(int funds) {
        Scanner scan = new Scanner(System.in);
        int usedTwenty = 0;
        int usedFifty = 0;
        int usedHundred = 0;

        while (funds != 0) {
            if ((valueTwenty * 20 + valueFifty * 50 + valueHundred * 100) < funds) {
                System.out.print("\nThere are not enough funds in the ATM. Try another amount or enter 0 to exit: ");
                funds = scan.nextInt();
                continue;
            }

            if (funds > 99 && valueHundred > 0) {
                if ((funds / 100) > valueHundred) {
                    usedHundred = valueHundred;
                    funds -= valueHundred * 100;
                    valueHundred = 0;
                } else {
                    usedHundred = funds / 100;
                    valueHundred -= usedHundred;
                    funds -= usedHundred * 100;
                }
            }

            if (funds > 49 && valueFifty > 0) {
                if ((funds / 50) > valueFifty) {
                    usedFifty = valueFifty;
                    funds -= valueFifty * 50;
                    valueFifty = 0;
                } else {
                    usedFifty = funds / 50;
                    valueFifty -= usedFifty;
                    funds -= usedFifty * 50;
                }
            }

            if (funds > 19 && valueTwenty > 0) {
                if ((funds / 20) > valueTwenty) {
                    usedTwenty = valueTwenty;
                    funds -= valueTwenty * 20;
                    valueTwenty = 0;
                } else {
                    usedTwenty = funds / 20;
                    valueTwenty -= usedTwenty;
                    funds -= usedTwenty * 20;
                }
            }

            if (funds == 0) {
                System.out.println("\nThe number of denomination used:\n" + "100's - "
                        + usedHundred + "\n50's - " + usedFifty + "\n20's - " + usedTwenty);
                return true;
            } else {
                System.out.print("\nThere are no available denominations to dispense the entered amount. Try another amount or enter 0 to exit: ");
                funds = scan.nextInt();
            }

        }
        return false;
    }
}