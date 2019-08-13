package com.javarush.task.task13.task1318;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName=bufferedReader.readLine();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
        while (inputStream.available()>0) {
            int data=inputStream.read();
            System.out.print((char)data);
        }
        bufferedReader.close();
        inputStream.close();
    }
}