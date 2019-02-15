package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    private static int counter=0;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <3 ; i++) {
            countPositive(Integer.parseInt(bf.readLine()));
        }
        System.out.println(counter);
    }

    private static void countPositive (int number) {
        if (number>0) counter++;
    }
}
