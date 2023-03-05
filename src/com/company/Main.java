package com.company;

import java.util.Scanner;

public class Main {
    //public static User [] users = new User[5];
    public static Scanner scan = new Scanner(System.in);

public static User[] getUsers() {

    User user1 = new User("jhon", "jhon@gmail.com", "pass1", 24);
    User user2 = new User("vasya", "vasyan@gmail.com", "pass2", 40);
    User user3 = new User("vova", "vova@gmail.com", "pass3", 18);
    User user4 = new User("masha", "masha@gmail.com", "pass4", 16);
    User user5 = new User("katya", "katya@gmail.com", "pass5", 5);
    return new User[] {user1, user2, user3, user4, user5};
}
public static String getUserByLoginAndPassword(String login, String password) throws UserNotFoundException{
    User[] users = getUsers();
    String str = "";
    boolean count = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                str = users[i].toString();

                break;
            }
        }
            if (str == ""){
            throw new UserNotFoundException("User not found");}


    //if (count = false) {
    System.out.println(str);
return str;
}
    public static void main(String[] args) {




      System.out.println("Введите свой логин:");
        String log = scan.nextLine();
        System.out.println("Введите свой пароль:");
        String pas = scan.nextLine();



        try {
            getUserByLoginAndPassword(log, pas);
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь с таким логином и паролем не найден!");
        }


    }




}
