package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s = bf.readLine();
            if (s.equals("сумма")) break;
            int num = Integer.parseInt(s);
            sum = sum+ num;
        }
        System.out.println(sum);
    }
}
