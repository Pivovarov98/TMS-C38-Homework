package lesson_11_homework;

import java.util.Scanner;

public class LessonHomework {
    public static void main(String[] args) {
        String[] str = new String[3];

        System.out.println("Enter 3 strings:");

        for (int i = 0; i < str.length; i++) {
            str[i] = input().nextLine();
        }
        System.out.println("-".repeat(50));

        shortestAndLongestString(str);
        ascendingOrderString(str);
        shorterLengthThanAvg(str);
        differentSymbolsWord(str);
        doubleLetter();
        palindromeWord();

    }

    //Task 1
    static void shortestAndLongestString(String[] str) {
        String shortest = str[0], longest = str[0];

        for (String line : str) {
            if (shortest.length() > line.length()) shortest = line;
            if (longest.length() < line.length()) longest = line;
        }

        System.out.printf("The shortest string is: \"%s\" and it's length is: %d\n", shortest, shortest.length());
        System.out.printf("The longest string is: \"%s\" and it's length is: %d\n", longest, longest.length());
        System.out.println("-".repeat(50));
    }

    //Task 2
    static void ascendingOrderString(String[] str) {
        String variable = str[0];

        for (int i = 1; i < str.length; i++) {
            if (variable.length() > str[i].length()) {
                str[i - 1] = str[i];
                str[i] = variable;
            }
            variable = str[i];
        }

        for (String line : str) {
            System.out.println(line);
        }
        System.out.println("-".repeat(50));
    }

    //Task 3
    static void shorterLengthThanAvg(String[] str) {
        int avgLength = 0;

        for (String line : str) {
            avgLength += line.length();
        }
        avgLength /= str.length;
        System.out.println("Average length of stings: " + avgLength);

        for (String line : str) {
            if (line.length() < avgLength)
                System.out.printf("String: \"%s\" and it's length is: %d\n", line, line.length());
        }
        System.out.println("-".repeat(50));
    }

    //task 4
    static void differentSymbolsWord(String[] str) {
        String newString = String.join(" ", str);
        String[] words = newString.split(" |, ");

        for (String word : words) {
            boolean uniqueChek = true;
            if (word.length() > 3) {

                for (int i = 0; i < word.length(); i++) {
                    for (int j = i + 1; j < word.length(); j++) {
                        if (word.charAt(i) == word.charAt(j)) {
                            uniqueChek = false;
                            break;
                        }
                    }
                    if (!uniqueChek) break;
                }

                if (uniqueChek) {
                    System.out.println("The unique word is: " + word);
                    System.out.println("-".repeat(50));
                    return;
                }
            }
        }

        System.out.println("There are no unique words");
        System.out.println("-".repeat(50));
    }

    //Task 5
    static void doubleLetter() {
        System.out.println("Enter the word: ");
        String word = input().nextLine();
        StringBuilder build = new StringBuilder();

        for (char letter : word.toCharArray()) {
            build.append(letter).append(letter);
        }
        System.out.println(build);
        System.out.println("-".repeat(50));
    }

    //Task 6*
    static void palindromeWord() {
        System.out.println("Enter the string: ");
        String[] str = input().nextLine().split(" |, ");
        System.out.println("Enter the number of word to check: ");
        int num = input().nextInt() - 1;

        if (num > str.length) System.out.println("There are less words in the string");

        String sb = new StringBuilder(str[num]).reverse().toString();

        if (str[num].equalsIgnoreCase(sb)) {
            System.out.println("This word is a palindrome: " + str[num]);
        } else {
            System.out.println("This word is not a palindrome: " + str[num]);
        }
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}
