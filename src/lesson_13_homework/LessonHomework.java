package lesson_13_homework;

public class LessonHomework {

    public static void main(String[] args) throws Exception {
        //Task 1
        try {
            User user = new User("kiss", "2fdg", "2fdg");
            System.out.println("User registered successfully");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }

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
