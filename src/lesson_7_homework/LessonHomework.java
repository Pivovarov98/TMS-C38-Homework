package lesson_7_homework;

public class LessonHomework {
    public static void main(String[] args) {
        //Task 1
        Patient patient1 = new Patient(new int[]{3});
        Patient patient2 = new Patient(new int[]{1, 2});
        Patient patient3 = new Patient(new int[]{1, 2, 3});

        Therapist headTherapist = new Therapist("Dr.Cuddy");

        headTherapist.drawingUpTreatmentPlan(patient1);
        headTherapist.drawingUpTreatmentPlan(patient2);
        headTherapist.drawingUpTreatmentPlan(patient3);

        //Task 2*
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        apple1.printColor();
        apple1.changeColor("Yellow");
        apple1.printColor();

        System.out.println("-".repeat(50));

        apple2.printColor();
        apple2.appleRipening();
        apple2.printColor();
    }
}
