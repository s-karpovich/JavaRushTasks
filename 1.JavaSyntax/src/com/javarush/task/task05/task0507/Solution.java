package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int counter = 0;
        while (true) {
            int number = Integer.parseInt(bf.readLine());
            if (number==-1) {break;}
            counter++;
            sum = sum +number;
        }
        System.out.println((double)sum/counter);
    }
}

