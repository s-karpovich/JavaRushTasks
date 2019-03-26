package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(bf.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(bf.readLine()));
        bf.close();
        StringBuilder sb = new StringBuilder();

        while (fr.ready()) {
            sb.append((char)fr.read());
        }
        fr.close();

        String s = sb.toString();
        s = s.replaceAll("\\.", "!");
        fw.write(s);
        fw.close();
    }
}
