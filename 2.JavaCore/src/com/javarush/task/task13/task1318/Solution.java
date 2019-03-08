package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();


        InputStream inputStream = new FileInputStream(name);
        Solution myObject = new Solution();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            System.out.print(data);
        }

        inputStream.close();
        bf.close();
    }
}