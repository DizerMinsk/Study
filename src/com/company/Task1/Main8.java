package com.company.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

/**
 * Created by Nick on 21.01.2016.
 */
public class Main8 {

    //public static String[][] battleField =  {{"0","0","0","0","0","0","0","0","0","0"},{"0","0","0","0","0","0","0","0","0","0"}};






    public static void main(String[] args) throws IOException {

        String[][] battleField  = new String[10][10];

        for(int i=0;i<10;i++)
        {
            for(int k=0;k<10;k++)
            {
                battleField[i][k] = "0";
            }
        }


        battleField[1][1]="*";
        battleField[1][2]="*";
        battleField[1][3]="*";
        battleField[1][4]="*";

      battleField[3][0]="*";
        battleField[3][2]="*";
        battleField[3][3]="*";


        battleField[5][1]="*";
        battleField[5][2]="*";
        battleField[5][3]="*";

        battleField[1][6]="*";
        battleField[1][7]="*";
        battleField[3][6]="*";
        battleField[3][7]="*";
        battleField[5][6]="*";
        battleField[5][7]="*";

        battleField[8][5]="*";
        battleField[9][9]="*";
        battleField[8][3]="*";
        battleField[9][0]="*";


        System.out.print("X");
        System.out.print("|");


        for(int k=0;k<10;k++)
        {
            System.out.print(k);
        }

        System.out.println();

        for(int k=0;k<12;k++)
        {
            System.out.print("-");
        }
        System.out.println();


        for (int i=0;i<10;i++)
        {
            System.out.print(i);
            System.out.print("|");

            for(int k=0;k<10;k++)
            {
                System.out.print(battleField[i][k]);
            }
            System.out.println();
        }


    }



}
