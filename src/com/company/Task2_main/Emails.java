package com.company.Task2_main;

import java.util.ArrayList;

/**
 * Created by Nick on 28.01.2016.
 */
public class Emails extends Communication_tools {

    int maxSize;
    ArrayList<Emails> addressBook;
    ArrayList<Emails> spamList;

    Emails (int attribute, Human owner, String login, String password)
    {
        this.owner = owner;
        this.provider = provider;
        this.login = login;
        this.password = password;
        counts +=1;
    }


    public boolean addInAddressBook (Emails email)
    {
        addressBook.add(email);
        return true;
    }




}
