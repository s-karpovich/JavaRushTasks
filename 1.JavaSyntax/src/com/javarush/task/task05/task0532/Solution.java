package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n < 0) System.out.println("Введите число >0");
//        int maximum;
//        int i = 1;
//        int num;
//
//        do {
//            maximum = Integer.parseInt(reader.readLine());
//            i++;
//        }
//        while (i < n);
//        {   num = Integer.parseInt(reader.readLine());
//            if (num > maximum) {
//                maximum = num;
//            }
//        }
        int maximum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n-1; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (maximum < num) {
                maximum = num;
            }
        }
        System.out.println(maximum);
    }
}

