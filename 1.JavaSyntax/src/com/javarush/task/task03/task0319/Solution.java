package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        String num1s = bf.readLine();
        String num2s = bf.readLine();
        int num1 = Integer.parseInt(num1s);
        int num2=Integer.parseInt(num2s);
        System.out.println(name + " получает " + num1+ " через " + num2 + " лет.");

        //System.out.println(bf.readLine()+ " получает " + bf.readLine() + " через " + bf.readLine()+ " лет");

    }
}
