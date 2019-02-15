package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a=1;

        while (a<=10) {
            int b=1;
            while (b<=10) {
                System.out.printf("%-3d", a*b);
                b++;
            }
            System.out.println();
            a++;
        }

//        System.out.println();
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.printf("%-3d", i*j);
//            }
//            System.out.println();
//        }
    }
}
