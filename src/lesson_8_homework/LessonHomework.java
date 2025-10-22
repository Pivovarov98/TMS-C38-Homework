package lesson_8_homework;

public class LessonHomework {
    public static void main(String[] args) {

        //Task 1
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        dog.voice();
        dog.eat("meat");
        dog.eat("banana");
        System.out.println("-".repeat(50));

        tiger.voice();
        tiger.eat("meat");
        tiger.eat("coconut");
        System.out.println("-".repeat(50));

        rabbit.voice();
        rabbit.eat("grass");
        rabbit.eat("crab");
        System.out.println("-".repeat(50));

        //Task 2*
        Doggy.voice();
        Doggy.eat("meat");
        Doggy.eat("orange");
        System.out.println("-".repeat(50));

        Doggy doggy = Doggy.createDoggy();
        doggy.nonStaticVoice();
        doggy.nonStaticEat("meat");
        doggy.nonStaticEat("apple");
        System.out.println("-".repeat(50));
    }
}