package lesson_6_homework;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard card1 = new CreditCard();
        card1.cardNumber = "1234567891011121";
        card1.accountNumbe = "BY3005487381647725";
        card1.expirationDate = "08/29";
        card1.csvCode = 133;
        card1.cardholderDetails = "Ivan Ivanov";
        card1.amount = 1435.35;
        card1.currency = "BYN";

        CreditCard card2 = new CreditCard();
        card2.cardNumber = "1578846235981486";
        card2.accountNumbe = "BY3005484365978123";
        card2.expirationDate = "05/27";
        card2.csvCode = 259;
        card2.cardholderDetails = "Petr Petrov";
        card2.amount = 913.00;
        card2.currency = "BYN";

        CreditCard card3 = new CreditCard();
        card3.cardNumber = "2587456912593684";
        card3.accountNumbe = "BY3005485987624158";
        card3.expirationDate = "11/31";
        card3.csvCode = 983;
        card3.cardholderDetails = "Victor Victorovich";
        card3.amount = 738.98;
        card3.currency = "BYN";

        card1.printCardData();
        card2.printCardData();
        card3.printCardData();

        card1.depositFunds(300);
        card2.depositFunds(125);
        card3.withdrawalFunds(220);

        card1.printAmount();
        card2.printAmount();
        card3.printAmount();

        ATM atm = new ATM();

        atm.refillATM(5, 5, 5);

        System.out.print("Enter the amount to withdraw cash: ");
        int withdraw = scan.nextInt();
        atm.withdrawalSuccessCheck(withdraw);
        atm.checkATMBalance();

        atm.refillATM(8, 3, 3);
        atm.checkATMBalance();

    }
}

//Task 1
class CreditCard {
    String cardNumber;
    String expirationDate;
    int csvCode;
    double amount;
    String accountNumbe;
    String currency;
    String cardholderDetails;

    void printCardData() {
        String numbers = String.join(" ", cardNumber.split("(?<=\\G.{4})"));
        System.out.printf("Card Number: %s \nExpiration data: %s \nCSV code: %d \nCardholder: %s \nAmount: %.2f %s\n",
                numbers, expirationDate, csvCode, cardholderDetails, amount, currency);
        System.out.println();
    }

    void printAmount() {
        System.out.printf("Current amount: %.2f %s\n", amount, currency);
        System.out.println();
    }

    void depositFunds(double funds) {
        amount += funds;
    }

    void withdrawalFunds(double funds) {
        if (amount < funds) {
            System.out.println("Not enough funds on the card");
        } else {
            amount -= funds;
        }
        System.out.println();
    }
}

//Task 2*
class ATM {
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
