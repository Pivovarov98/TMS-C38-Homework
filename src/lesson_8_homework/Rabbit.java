package lesson_8_homework;

public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Squeeee");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equalsIgnoreCase("Grass")
                ? "The rabbit looks happy with this food"
                : "The rabbit looks unhappy");
    }
}