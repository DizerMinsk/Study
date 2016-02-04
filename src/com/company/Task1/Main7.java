package com.company.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nick on 21.01.2016.
 */
public class Main7 {

    public static void main(String[] args) throws IOException {
        boolean metka = true;

        while (metka != false) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] channel = {"Video", "Belarus-1", "Belarus-2", "Belarus-3", "Belarus-4", "ONT"};

            System.out.println("Enter the number of channel");
            int i;
            for ( i = 0; i < channel.length; i++) {
                System.out.println("Channel #" + i + " is " + channel[i]);
            }

            String sChannel = reader.readLine();
            int nChannel = Integer.parseInt(sChannel);

            if (nChannel > (channel.length-1) || nChannel < 0) {
                System.out.println("Try again");
            } else {

                System.out.println("Your current channel is "+channel[nChannel]);
            }

            System.out.println("Do you want another operation? (Y/N)");

            String sYesNo = reader.readLine();

            if (sYesNo == "N"||sYesNo == "No")
            {
                metka = false;
            }

        }

    }


    }
