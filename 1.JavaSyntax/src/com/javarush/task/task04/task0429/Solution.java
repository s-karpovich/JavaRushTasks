package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    private static int counterMinus=0;
    private static int counterPlus=0;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 0; i <3 ; i++) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            counter(Integer.parseInt(bf.readLine()));
        }
        System.out.println("количество отрицательных чисел: " + counterMinus);
        System.out.println("количество положительных чисел: " + counterPlus);
    }

    private static void counter(int number) {
        if (number>0) counterPlus++;
        if (number<0) counterMinus++;
    }
}
