package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bf.readLine());
        FileWriter fileWriter = new FileWriter(bf.readLine());
        bf.close();

        int count=1;
        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()){
            char chars = (char)fileReader.read();
            if (count%2==0) {
            sb.append(chars);}
            count++;
        }
        fileReader.close();
        fileWriter.write(sb.toString());
        fileWriter.close();
    }
}
