package com.company.Task2_main;

import java.util.ArrayList;

/**
 * Created by Nick on 28.01.2016.
 */
public class Messengers extends Communication_tools {

    private ArrayList<Messengers> contactList;
    private ArrayList<Messengers> blackList;
    private int attribute; //0icq-1skype
    private boolean isInTouch;


    Messengers (int attribute, Human owner, String login, String password)
    {
        this.attribute = attribute;
        this.owner = owner;
        this.provider = provider;
        this.login = login;
        this.password = password;
        counts +=1;
    }


    public boolean addInContactList (Messengers messengers)
    {
        getContactList().add(messengers);
        return true;
    }


    public ArrayList<Messengers> getContactList() {
        return contactList;
    }

    public int getAttribute() {
        return attribute;
    }

    public boolean isInTouch() {
        return isInTouch;
    }
}
