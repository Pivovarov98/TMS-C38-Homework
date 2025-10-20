package lesson_7_homework;

public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    @Override
    void cure() {
        System.out.printf("The dentist %s treated teeth\n", name);
    }
}
