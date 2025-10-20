package lesson_7_homework;

public class Apple {
    private String color = "Green";

    void printColor() {
        System.out.println("Apple color is: " + color);
    }

    void changeColor(String newColor) {
        color = newColor;
    }

    void appleRipening() {
        color = "Red";
    }
}
