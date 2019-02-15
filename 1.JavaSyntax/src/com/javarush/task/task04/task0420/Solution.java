package com.javarush.task.task04.task0420;
/* 
Сортировка трех чисел
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        swap(a, b, c);
    }

    private static void swap(int a, int b, int c) {
        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
