package lesson_7_homework;

public class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    @Override
    void cure() {
        System.out.printf("The surgeon %s performed the operation\n", name);
    }
}
