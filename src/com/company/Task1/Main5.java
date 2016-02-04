package com.company.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nick on 24.01.2016.
 */
public class Main5 {

    public static void main(String[] args) throws IOException {

        String result = "There is no love:(";
        boolean metka = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (metka != true)
        {
        System.out.println("How are you?");
            String answer = reader.readLine();

            if (!answer.equals("fine")) {
                metka = true;
            }
            else
            {
                System.out.println("What is your name?");
                answer = reader.readLine();

                if (answer != null)
                {
                    System.out.println("Have you a boyfrend?");
                    answer = reader.readLine();

                    if (answer.equals("yes") || answer.equals("YES") || answer.equals("Y"))
                    {

                    }
                    else
                    {
                        result = "The love is possible";
                    }

                    metka= true;
                }
                else
                {
                    metka = true;
                }

            }
        }

System.out.println(result);

    }
}
