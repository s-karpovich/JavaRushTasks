package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        String num1 = bf.readLine();
        int num1Int = Integer.parseInt(num1);
        String num2 = bf.readLine();
        int num2Int = Integer.parseInt(num2);
        System.out.println(name + " получает " + num1Int + " через " + num2Int + " лет.");
    }
}
