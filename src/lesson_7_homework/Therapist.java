package lesson_7_homework;

public class Therapist extends Doctor {
    public Therapist(String name) {
        super(name);
    }

    @Override
    void cure() {
        System.out.printf("The therapist %s prescribed medications for general treatment\n", name);
    }

    void drawingUpTreatmentPlan(Patient patient) {
        int[] plan = patient.getTreatmentPlan();

        System.out.printf("The head therapist %s prescribes a treatment plan.\nThe patient begins treatment:\n", name);
        for (int code : plan) {
            Doctor doctor = switch (code) {
                case 1 -> new Surgeon("Dr.Chase");
                case 2 -> new Dentist("Dr.Wilson");
                default -> new Therapist("Dr.House");
            };
            doctor.cure();
        }
        System.out.println("-".repeat(50));
    }
}
