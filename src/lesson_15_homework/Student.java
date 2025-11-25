package lesson_15_homework;

import java.util.List;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> subjectGrades;

    public Student(String name, String group, int course, List<Integer> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    int getCourse() {
        return course;
    }

    String getName() {
        return name;
    }

    void nextCourse() {
        course += 1;
    }

    double getAVG() {
        int sum = 0;
        for (int numbers : subjectGrades) {
            sum += numbers;
        }
        return (double) sum / (double) subjectGrades.size();
    }

    @Override
    public String toString() {
        return "\nStudent:"
                + "\n\tName: " + name
                + "\n\tGroup: " + group
                + "\n\tCours: " + course
                + "\n\tGrades: " + subjectGrades;
    }
}
