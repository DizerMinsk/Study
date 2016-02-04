package com.company.Task2_from_chapters;

import java.io.IOException;

/**
 * Created by Nick on 26.01.2016.
 */
public class Main_constructor {

    int type;
    String name;
    String number;
    double summa;


    public static void main(String[] args) throws IOException {

        Main_constructor a = new Main_constructor(1);
        Main_constructor b = new Main_constructor(2);

/*
вопрос:  корректно ли использовать конструктор таким образом? в зависимости от переданного одиночного параметра
устанавливать объекту набор значений по умолчанию? Или в таком случае лучше создать несколько конструкторов?
 */

    }

    Main_constructor (int type)
    {
        if (type == 1)
        {
            this.number = "20";
            this.summa = 1000;
            this.type = type;
        }

        if (type == 2)
        {
            this.number = "30";
            this.summa = 5000;
            this.type = type;
        }
    }
}
