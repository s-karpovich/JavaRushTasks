package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fi = new FileInputStream(bf.readLine());
        // FileInputStream fi = new FileInputStream("e://baton.txt");

        int count = 0;
        while (fi.available() > 0) {
            if (fi.read() == 44) { count++; }
        }
        bf.close();
        fi.close();
        System.out.println(count);
    }
}
