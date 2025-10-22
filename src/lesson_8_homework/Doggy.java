package lesson_8_homework;

public class Doggy {
    private Doggy() {
    }

    static void voice() {
        System.out.println("Waff");
    }

    static void eat(String food) {
        System.out.println(food.equalsIgnoreCase("Meat")
                ? "The dogy looks happy with this food"
                : "The doggy looks very confused");
    }

    static lesson_8_homework.Doggy createDoggy() {
        return new lesson_8_homework.Doggy();
    }

    void nonStaticVoice() {
        System.out.println("Waff");
    }

    void nonStaticEat(String food) {
        System.out.println(food.equalsIgnoreCase("Meat")
                ? "The dogy looks happy with this food"
                : "The doggy looks very confused");
    }
}