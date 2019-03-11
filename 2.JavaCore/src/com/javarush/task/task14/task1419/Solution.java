package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        arrayIndexOutOfBoundsException();
        classCastException();
        nullPointerException();
        numberFormatException();
        negativeArraySizeException();
        filenotFound();
        indexOutOfBoundsException();
        arrayStoreException();
        securityException();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    //напишите тут ваш код
    private static void arrayIndexOutOfBoundsException() {   //the first exception
        try {
            int[] arr = new int[3];

            for (int i = 0; i <= 4; i++) {
                arr[i] = i;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }

    private static void classCastException() {   //the first exception
        try {
            Object object = new Object();
            Solution solution = (Solution) object;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
    }


    private static void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
    }

    private static void numberFormatException() {
        try {
            double num = Double.parseDouble("double");
            System.out.println(num);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
    }

    private static void negativeArraySizeException() {
        int x = -1;
        try {
            int[] array = new int[x];

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
    }

    private static void filenotFound() {
        try {
            File file = new File("c://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
    }


    private static void indexOutOfBoundsException() {
        try {
            String s = "";
            s.charAt(2);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }

    private static void arrayStoreException() {

        try {
            Object object[] = new Double[5];
            object[2] = new String("");
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
    }

    private static void securityException() {

        try {
            throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }
    }
}
