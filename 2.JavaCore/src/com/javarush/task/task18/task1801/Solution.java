package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName=bf.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int max=0;
        while(fileInputStream.available()>0) {
            int data = fileInputStream.read();
            if (data>max) max=data;
        }
        System.out.println(max);
        bf.close();
        fileInputStream.close();
    }
}
