package games.guess_the_word;

import java.util.Arrays;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usedLettersIndex = 0;
        boolean isCoincidence;
        String str;
        String hiddenWord = "APPLE";
        String[] word = hiddenWord.split("");
        String[] usedLetters = new String[50];
        String[] guessedLetters = new String[word.length];
        Arrays.fill(guessedLetters, "*");
        System.out.print("Let's play a game. Can you guess my word?" +
                "\nThe word: " + String.join("", guessedLetters) +
                "\nEnter a letter or an entire word: ");

        while (true) {
            str = scan.nextLine();
            isCoincidence = false;
            System.out.println("-------------------------------------------------");

            //Если передаём слово, а не букву
            if (str.length() > 1) {
                if (winChek(hiddenWord, str.toUpperCase())) {
                    System.out.println("You won, the word was: " + hiddenWord);
                    break;
                }
                System.out.print("Try again or enter a single letter: ");
                continue;
            }

            //Если передаём букву
            if (Arrays.asList(usedLetters).contains(str.toUpperCase())) {
                System.out.print("You have already used this letter, try another one or enter the whole word: ");
                continue;
            }
            usedLetters[usedLettersIndex] = str.toUpperCase();
            usedLettersIndex++;

            for (int i = 0; i < hiddenWord.length(); i++) {
                if (word[i].equalsIgnoreCase(str)) {
                    guessedLetters[i] = word[i];
                    isCoincidence = true;
                }
            }

            if (winChek(hiddenWord, String.join("", guessedLetters))) {
                System.out.println("You won, the word was: " + hiddenWord);
                break;
            }

            if (isCoincidence) {
                System.out.print("Well done, you guessed the letter.\n" +
                        String.join("", guessedLetters) +
                        "\nEnter the next letter or write the whole word: ");
                continue;
            }

            System.out.print("There is no such letter in this word.\n" +
                    String.join("", guessedLetters) +
                    "\nTry again or enter an entire word: ");
        }
    }

    public static boolean winChek(String wordForWin, String guessedLetters) {
        return guessedLetters.equals(wordForWin);
    }
}

