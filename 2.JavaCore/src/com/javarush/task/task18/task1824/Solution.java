package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = null;

        try {

            while (true) {
                s = scanner.nextLine();
                FileInputStream fi = new FileInputStream(s);
                fi.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(s);
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



