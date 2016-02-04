package com.company.Task2_main;

/**
 * Created by Nick on 28.01.2016.
 */
public abstract class Communication_tools implements ICommunication_tools {

    //реализую интерфейс в абстрактном классе
    //абстрактный класс

    public static int counts;

    public Connection makeConnection(Communication_tools toolSender, Communication_tools toolReceiver, String Password) {
       return new Connection();
    }


    public boolean changeOwner(Communication_tools tool, Human owner, String Password) {
        return false;
    }


    public boolean changePassword(Communication_tools tool, String oldPassword, String newPassword) {
        return false;
    }


    public Human owner;
    public String login;
    public boolean isPassword;
    public String password;
    public Providers provider;

}
