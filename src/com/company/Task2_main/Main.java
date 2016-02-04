package com.company.Task2_main;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Nick on 03.02.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Human human1 = new Human("Ivan","Sidorov",20,"Minsk");

        Human human2 = new Human("Petr","Sidorov",21,"Brest");

        Providers mts = new Providers("mts");
        Providers velcom = new Providers("velcom");
        Providers beltelekom = new Providers("beltelekom");




        Phones phone1 = new Phones(0,human1,mts,"+3752977755444","password");
        human1.tools.add(phone1);
        Phones phone3 = new Phones(0,human1,mts,"+3752977755445","password");
        human1.tools.add(phone3);
        Phones phone4 = new Phones(0,human1,velcom,"+3752967755446","password");
        human1.tools.add(phone4);
        Phones phone5 = new Phones(0,human1,mts,"+3752977755447","password");
        human1.tools.add(phone5);
        Phones phone2 = new Phones(1,human2,beltelekom,"+375172600000","password");

        Connection con1 = phone1.makeConnection(phone1, phone2, phone1.password);


        Thread.sleep(1900);

        phone1.closeConnection(con1);

        System.out.println(con1.toString());


        phone1 = null;

        try {
            phone1.closeConnection(con1);
        }
        catch (NullPointerException e)
        {
            System.out.println("Can't define one of participants!!!");
        }

//а  с итератором что не так?
        Iterator iterator = human1.tools.iterator();

        while (iterator.hasNext())
        {
            iterator.next();
            System.out.println(iterator.next());
        }

    }

}
