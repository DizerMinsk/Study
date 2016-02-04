package com.company.Task1;

/**
 * Created by Nick on 21.01.2016.
 */
public class Main3 {

    public static void main(String[] args) {
        String a = "Плинда Николай Александрович";
        String b = "Плинда Николай Александрович1";

        System.out.println(a.length());
        System.out.println(a.charAt(5));
        System.out.println(a.codePointAt(1));
        System.out.println(a.codePointBefore(2));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.concat(b));
        System.out.println(a.codePointCount(2,5));
        System.out.println(a.contains("ли"));
        System.out.println(a.endsWith("ич"));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.replace("д","т"));
    }

}
