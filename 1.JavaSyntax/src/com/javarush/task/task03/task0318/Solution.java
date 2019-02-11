package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String term=bufferedReader.readLine();
        //int termInt=Integer.parseInt(term);
        String name=bufferedReader.readLine();

        System.out.println(name + "захватит мир через " + term + " лет. Му-ха-ха!");
    }
}
