package lesson_8_homework;

public class Dog extends Animal {

    @Override
    void voice() {
        System.out.println("Woof");
    }

    @Override
    void eat(String food) {
        System.out.println(food.equalsIgnoreCase("Meat")
                ? "The dog looks happy with this food"
                : "The dog looks confused");
    }
}