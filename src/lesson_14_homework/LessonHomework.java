package lesson_14_homework;

import java.io.*;

public class LessonHomework {
    public static void main(String[] args) throws IOException {
        findLongestWordInFile("C:\\Users\\Admin\\IdeaProjects\\TMS-C38-Homework\\src\\lesson_14_homework\\romeo&juliet.txt");
    }

    //Task 1
    static void findLongestWordInFile(String path) throws IOException {
        String longestWord = "";
        String word = "";
        String outputFilePath = "C:\\Users\\Admin\\IdeaProjects\\TMS-C38-Homework\\src\\lesson_14_homework\\longest_word.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int charLetter;

            while ((charLetter = reader.read()) != -1){
                char letter = (char) charLetter;

                if(Character.isLetter(letter)){
                    word += letter;
                } else {
                    if (word.length() > longestWord.length()){
                        longestWord = word;
                    }
                    word ="";
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(outputFilePath)){
            writer.write(longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
