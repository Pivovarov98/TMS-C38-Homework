package lesson_18_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class LessonHomework {
    public static void main(String[] args) {

        //Task 1
        streamsFunctions(new ArrayList<>(Arrays.asList(1, 2, 3, 1, 5, 7, 7, 5, 4, 4, 4, 1, 6)));
        streamsFunctions(new ArrayList<>(Arrays.asList(1, 3, 5, 5, 6, 6, 1, 7, 6)));
        streamsFunctions(new ArrayList<>(Arrays.asList(1, 3, 3, 5)));
    }

    static void streamsFunctions(ArrayList<Integer> numbers) {
        System.out.println(numbers.stream().
                distinct().
                filter(n -> n % 2 == 0).
                mapToInt(Integer::intValue).
                sum());
    }
}
