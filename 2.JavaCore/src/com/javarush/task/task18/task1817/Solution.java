package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int countAll=0, countSpaces=0;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[0]));
        while (bufferedInputStream.available() > 0) {
            countAll++;
            if (bufferedInputStream.read() == 32) {
                countSpaces++;
            }


        }
        System.out.printf("%.2f", (double) countSpaces/countAll*100);
        bufferedInputStream.close();
    }
}
