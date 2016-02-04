package com.company.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nick on 21.01.2016.
 */
public class Main6 {

    public static void main(String[] args) throws IOException {

        String op1 = "1 - First operarion";
        String op2 = "2 - Second operarion";
        String op3 = "3 - Third operarion";
        boolean metka = false;

        while (metka==false)
        {
            System.out.println("Choose the menu item:");
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println("4 - Exit");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String sItem = reader.readLine();
            int nItem = Integer.parseInt(sItem);

            switch (nItem){
                case 1:
                    System.out.println(op1);
                    break;
                case 2:
                    System.out.println(op2);
                    break;
                case 3:
                    System.out.println(op3);
                    break;
                case 4:
                    System.out.println("Good bye");
                    metka = true;
                    break;

                default:
                    System.out.println("Be attentive");
                    break;
            }



        }

    }
}
