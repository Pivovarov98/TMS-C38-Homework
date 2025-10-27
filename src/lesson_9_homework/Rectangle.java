package lesson_9_homework;

public class Rectangle extends Shape {
    double side1;
    double side2;

    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return side1 * side2;
    }

    @Override
    void printArea() {
        System.out.printf("Area of rectangle: %.2f\n", area());
    }
}
