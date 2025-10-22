package lesson_8_homework;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Roar");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equalsIgnoreCase("Meat")
                ? "The tiger looks happy with this food"
                : "The tiger looks mad");
    }
}