package com.company.Task2_from_chapters;

import java.io.IOException;

/**
 * Created by Nick on 26.01.2016.
 */
public class Main_toString {
    String name;
    int portion;
    double price;


    Main_toString()
    {
        this.name="Roastbeaf";
        this.portion =1;
        this.price = 50;
    }



    @Override
    public String toString() {
        return "Name of order: "+this.name +", Number of portions: "+this.portion+", Price: "+this.price;
    }

    public static void main(String[] args) throws IOException {

        Main_toString a = new Main_toString();

        System.out.println(a.toString());
    }
}
