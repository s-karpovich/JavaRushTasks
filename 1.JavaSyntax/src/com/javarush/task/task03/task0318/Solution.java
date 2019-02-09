package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String term = bf.readLine();
        String name = bf.readLine();
        int termInt=Integer.parseInt(term);
        System.out.println(name + " захватит мир через " + termInt + " лет. Му-ха-ха!");
        //напишите тут ваш код
    }
}
