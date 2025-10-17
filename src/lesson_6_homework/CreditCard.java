package lesson_6_homework;

//Task 1
public class CreditCard {

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
