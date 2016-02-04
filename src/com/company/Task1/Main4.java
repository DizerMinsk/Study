package com.company.Task1;

import java.io.*;


/**
 * Created by Nick on 21.01.2016.
 */
public class Main4 {

    public static void main(String[] args) throws IOException {
        double salary1 = 0;
        double salary2 = 0;
        double salary3 = 0;

        boolean metka = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество лет, которые вы решили посвятить Java");
        String sYear = reader.readLine();
        int nMonth = Integer.parseInt(sYear)*12;


        for (int i=0; i<nMonth; i++)
        {
            salary1 +=1000;

            if (salary1>100000)
            {
                metka = true;
            }

        }


        int i=0;
        do {
            salary2 +=1000;
            i++;
        }
        while (i<nMonth);

        i=0;
        while (i<nMonth) {
            salary3 +=1000;
            i++;
        };

        if (metka==true)
        {
            System.out.println("Больше 100 тысяч в месяц Вам никто не даст, но результаты следующие:)");
        }

        System.out.println("salary first way "+salary1+"$");
        System.out.println("salary second way "+salary2+"$");
        System.out.println("salary third way "+salary3+"$");


    }
}
