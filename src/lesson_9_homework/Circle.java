package lesson_9_homework;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void printArea() {
        System.out.printf("Area of circle: %.2f\n", area());
    }
}
