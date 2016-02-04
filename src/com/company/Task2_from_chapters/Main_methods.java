package com.company.Task2_from_chapters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nick on 24.01.2016.
 */
public class Main_methods {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();

        int nFirst = Integer.parseInt(first);
        int nSecond = Integer.parseInt(second);

        sum(nFirst, nSecond);
    }

    public static void sum (int x, int y)
    {
        System.out.println("result="+x*y);
    }


}
