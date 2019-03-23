package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));

//        FileInputStream fileInputStream1 = new FileInputStream(bufferedReader1.readLine());
//        FileInputStream fileInputStream2 =  new FileInputStream(bufferedReader2.readLine());

        FileInputStream inputStream1 = new FileInputStream("e:/file1.txt");
        FileInputStream inputStream2 = new FileInputStream("e:/file2.txt");

        FileOutputStream outputStream = new FileOutputStream("e:/file1.txt");
        byte[] buffer1 = new byte[inputStream1.available()];
        int size = inputStream2.available();
        byte[] buffer2 = new byte[inputStream2.available()];
        int count1 = 0;

        while (inputStream1.available() > 0) {
            count1 = inputStream1.read(buffer1);

        while (inputStream2.available() > 0) {
            outputStream.write(inputStream2.read());
        }
            outputStream.write(buffer1, size, count1);
        }
    }
}




