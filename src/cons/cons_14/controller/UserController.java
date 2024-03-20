package cons.cons_14.controller;

import cons.cons_14.model.UserModel;
import cons.cons_14.view.UserView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    private static UserController controller = null;
    private Map<Integer, UserModel> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);




    public void showUser(int id) {
        UserModel user = users.get(id);
        if (user == null) {
            System.out.println("No user found with id " + id);
        } else {
            UserView view = new UserView(user);
            view.showUser();
        }
    }

    public boolean register() {
        // используем view чтобы показать форму регистрации
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Enter password: ");
        String pass = scanner.next();

        //валидация логина

        for (UserModel user : users.values()) {
            if (user.getLogin().equalsIgnoreCase(login)) {
                return false;
            }
        }

        // валидация пароля (наличие буквб цифр и т.д.)
        if (pass.length() < 8 || pass.length() > 63) {
            // вывести ссобщение, что пароль слишком короткий/длинный
            return false;
        }

        // INSERT INTO Users (login, password) VALUES (?, ?)
        // через PreparedStatement заполнить знаки вопроса и выполнить запрос....

        int newId = users.size();
        UserModel user = new UserModel(newId, login, pass);
        users.put(newId, user);
        return true;
    }

    public boolean logIn() {
        // используем view чтобы показать форму регистрации
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Enter your password: ");
        String pass = scanner.next();
        UserModel user = null;
        for (UserModel u : users.values()) {
            if (u.getLogin().equalsIgnoreCase(login)) {
                user = u;
                break;
            }
        }

        if (user.getPassword().equals(pass)) {
            return true;
        }

        // говорим что пароль указан не верно
        return false;

    /*
    for (UserModel user : users.values()) {
        if (user.getLogin().equals(login) && user.getPassword().equals(pass)) {
             return true;
        }
    }
     */
    }

    public int getUserId(String login) {
        for (UserModel u : users.values()) {
            if (u.getLogin().equals(login)) {
                return u.getId();
            }
        }
        return -1;
    }

    public String getUserLogin(int id) {
        UserModel user = users.get(id);
        if (user == null) {
            return null;
        }
        return user.getLogin();
    }

}