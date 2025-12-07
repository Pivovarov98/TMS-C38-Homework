package lesson_16_homework;

import java.util.HashMap;
import java.util.Map;

public class LessonHomework {
    public static void main(String[] args) {

        wordMultiple(new String[]{"a", "b", "a", "c", "b"});
        wordMultiple(new String[]{"c", "b", "a"});
        wordMultiple(new String[]{"c", "c", "c", "c"});
        System.out.println("-".repeat(50));

        pairs(new String[]{"code", "bug"});
        pairs(new String[]{"man", "moon", "main"});
        pairs(new String[]{"man", "moon", "good", "night"});
    }

    //Task 1
    static void wordMultiple(String[] strings) {
        Map<String, Boolean> wordMap = new HashMap<>();

        for (String letter : strings) {
            if (wordMap.containsKey(letter)) {
                wordMap.replace(letter, true);
            } else {
                wordMap.put(letter, false);
            }
        }

        System.out.println(wordMap);
    }

    //Task 2
    static void pairs(String[] strings) {
        Map<String, String> wordMap = new HashMap<>();

        for (String word : strings) {
            String[] letters = word.split("");
            wordMap.put(letters[0], letters[letters.length - 1]);
        }

        System.out.println(wordMap);
    }
}
