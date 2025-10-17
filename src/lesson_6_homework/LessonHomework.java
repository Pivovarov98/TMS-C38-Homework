package lesson_6_homework;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard card1 = new CreditCard();
        card1.cardNumber = "1234567891011121";
        card1.accountNumber = "BY3005487381647725";
        card1.expirationDate = "08/29";
        card1.csvCode = 133;
        card1.cardholderDetails = "Ivan Ivanov";
        card1.amount = 1435.35;
        card1.currency = "BYN";

        CreditCard card2 = new CreditCard();
        card2.cardNumber = "1578846235981486";
        card2.accountNumber = "BY3005484365978123";
        card2.expirationDate = "05/27";
        card2.csvCode = 259;
        card2.cardholderDetails = "Petr Petrov";
        card2.amount = 913.00;
        card2.currency = "BYN";

        CreditCard card3 = new CreditCard();
        card3.cardNumber = "2587456912593684";
        card3.accountNumber = "BY3005485987624158";
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