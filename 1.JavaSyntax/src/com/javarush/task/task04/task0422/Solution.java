package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(bf.readLine());
        if (age<18) System.out.println("Подрасти еще");
    }
}
