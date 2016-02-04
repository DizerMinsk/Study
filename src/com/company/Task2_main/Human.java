package com.company.Task2_main;

import java.util.ArrayList;

/**
 * Created by Nick on 28.01.2016.
 */
public class Human {
    private String name;
    private String surName;
    private int age;
    private String address;
    public ArrayList<Communication_tools> tools = new ArrayList<>();

    //поле класса хуман с типом список объектов
    //сматри тут что, тут

    Human (String name, String surName, int age, String address)
    {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }



    public ArrayList<Communication_tools> getTools() {
        return tools;
    }
}
