package com.company;

public class User {
    private String login;
    private String password;
    private String eMail;
    private  int age;

public User (String login, String eMail, String password, int age ){
    this.login = login;
    this.eMail = eMail;
    this.password = password;
    this.age = age;
}
public User(){

}

    public int getAge() {
        return age;
    }

    public String geteMail() {
        return eMail;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", age=" + age +
                '}';
    }
}
