package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1=bf.readLine();
        String fileName2=bf.readLine();
       //String fileName1="e:/file1.txt";
       // String fileName2="e:/file2.txt";

        BufferedReader br = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));

        bf.close();

        StringBuilder sb = new StringBuilder();
        while(br.ready()) {
            sb.append((char)br.read());
        }
        br.close();

        String s = sb.toString().replaceAll("\\r|\\n", "").replaceAll("\\p{Punct}", "");
        //System.out.println(s);
        bw.write(s);
        bw.close();
    }
}
