package com.company;

import java.util.Scanner;

public class Main {
    public static User [] user = new User[10];
    public static Scanner scan = new Scanner(System.in);
public static User[] getUsers() {
    User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
    User user2 = new User("vasya", "vasyan@gmail.com", "pass", 40);
    User user3 = new User("vova", "vova@gmail.com", "pass", 18);
    User user4 = new User("masha", "masha@gmail.com", "pass", 16);
    User user5 = new User("katya", "katya@gmail.com", "pass", 5);
    return new User[]{user1, user2, user3, user4, user5};
}
public static User[] getUserByLoginAndPassword(String login, String password) throws UserNotFoundException{
    User[] users = getUsers();
    for (User user : users) {
        if (user.login.equals(login) && user.password.equals(password)){
            break;
        }else{
            throw new UserNotFoundException("User not found");
        }

    }
    return user;
}
    public static void main(String[] args) {
      getUsers();
      System.out.println("Введите св,ой логин:");
        String log = scan.nextLine();
        System.out.println("Введите свой пароль:");
        String pas = scan.nextLine();

        getUserByLoginAndPassword(log, pas);

    }




}
