package lesson_9_homework;

public class LessonHomework {
    public static void main(String[] args) {
        //Task 1
        Director dir = new Director();
        Employee emp = new Employee();
        Accountant account = new Accountant();

        dir.printJob();
        emp.printJob();
        account.printJob();
        System.out.println("-".repeat(50));

        //Task 2
        Shape[] shapeArray = new Shape[]{new Circle(6),
                new Triangle(4, 5, 3),
                new Rectangle(6, 5),
                new Triangle(4.8, 5.4, 8.1),
                new Circle(12.3)
        };

        for (Shape shape : shapeArray) {
            shape.printArea();
        }
        System.out.println("-".repeat(50));

        //Task 3*
        Animal cat = new Animal("Cat", 4);

        try {
            Animal coppyCat = (Animal) cat.clone();

            cat.printInfo();
            coppyCat.printInfo();

            System.out.println(cat == coppyCat);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
