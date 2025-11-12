package lesson_13_homework;

import java.util.regex.Pattern;

public class User {
    String login;
    String password;
    String confirmPassword;

    public User(String login, String password, String confirmPassword) throws Exception {
        loginException(login);
        passwordException(password, confirmPassword);
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    static void loginException(String login) throws WrongLoginException {
        if (!Pattern.matches("^\\S{1,20}$", login))
            throw new WrongLoginException("the login must be less than 20 characters and must not contain spaces");
    }

    static void passwordException(String password, String confirmPassword) throws WrongPasswordException {
        if (!Pattern.matches("^(?=.*\\d)\\S{1,20}$", password)
                || !password.equals(confirmPassword))
            throw new WrongPasswordException("the password must be less than 20 characters, contain no spaces, include at least one digit, and match");
    }
}