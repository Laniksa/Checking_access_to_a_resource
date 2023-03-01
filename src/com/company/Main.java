package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    //public static User [] users = new User[5];
    public static Scanner scan = new Scanner(System.in);

public static User[] getUsers() {

    User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
    User user2 = new User("vasya", "vasyan@gmail.com", "pass", 40);
    User user3 = new User("vova", "vova@gmail.com", "pass", 18);
    User user4 = new User("masha", "masha@gmail.com", "pass", 16);
    User user5 = new User("katya", "katya@gmail.com", "pass", 5);
    return new User[] {user1, user2, user3, user4, user5};
}
public static void   getUserByLoginAndPassword(String login, String password) throws UserNotFoundException{
    User[] users = getUsers();
    for(int i = 0; i < users.length; i++){
        if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)){
            users.toString();
        }else{
            throw new UserNotFoundException("User not found");
        }
    }
//    for (User user : users) {
//        if (user.getLogin().equals(login) && user.getPassword().equals(password)){
//            user.toString();
//        }else{
//            throw new UserNotFoundException("User not found");
//        }



}
    public static void main(String[] args) {




      System.out.println("Введите св,ой логин:");
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
