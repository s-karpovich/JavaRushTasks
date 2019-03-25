package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(bf.readLine());
        bf.close();

        StringBuilder sb = new StringBuilder();
        while (fr.ready()) {
            sb.append((char)fr.read());
        }
        fr.close();

        String[] words = sb.toString().trim().split("[\\p{Punct}\\s+]");
        int count=0;

        for (String word : words) {
            if (word.equals("world")) {count++;}
        }
        System.out.println(count);
    }
}
