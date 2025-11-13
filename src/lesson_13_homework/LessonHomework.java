package lesson_13_homework;

public class LessonHomework {

    public static void main(String[] args) {
        //Task 1
        User user = User.createUser("kiss", "2fdg", "2fdg");
        if (user != null) System.out.println(user);
        System.out.println("-".repeat(50));

        //Task 2*
        try {
            System.out.println(10 / 2);
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("You are here");
        }
    }
}
