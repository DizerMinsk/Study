package com.company.Task2_main;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Nick on 28.01.2016.
 */
public class Phones extends Communication_tools {

    //наследую абстрактный класс

    private ArrayList<Phones> phoneBook;
    private ArrayList<Phones> blackList;
    private int attribute; //0mobile-1fixed-2payphone
    private boolean isInTouch = false;
    private boolean isBusy = false;

    Phones (int attribute, Human owner, Providers provider, String login, String password)
    {
        this.attribute = attribute;
        this.owner = owner;
        this.provider = provider;
        this.login = login;
        this.password = password;
        counts +=1;
    }


    public boolean addInPhoneBook (Phones phone)
    {
        getPhoneBook().add(phone);
    return true;
    }

    @Override
    public boolean changePassword(Communication_tools tool, String oldPassword, String newPassword) {

        if (isPassword == true) {
            if (this.password == oldPassword) {
                this.password = newPassword;
                return true;
            } else {
                return false;
            }
        } else {
            this.isPassword = true;
            this.password = newPassword;
            return true;
        }

    }

    @Override
    public Connection makeConnection(Communication_tools toolSender, Communication_tools toolReceiver, String password) {

        if (password == this.password) {

            Connection connect = new Connection (new Date(), toolSender,toolReceiver );
            return connect;
        }
        else
            return null;


    }

    public boolean closeConnection(Connection connection) {

            connection.endDate = new Date();
            return true;
    }



    public ArrayList<Phones> getPhoneBook() {
        return phoneBook;
    }

    public int getAttribute() {
        return attribute;
    }

    public boolean isInTouch() {
        return isInTouch;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public String toString()
    {
        return ("Owner: "+this.owner.getSurName() +" "+this.owner.getName()+", number: "+this.login );
    }


}