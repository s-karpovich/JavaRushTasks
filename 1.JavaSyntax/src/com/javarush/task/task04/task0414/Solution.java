package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int year=Integer.parseInt(bf.readLine());
        System.out.println(checkYear(year));
    }

    public static int checkYear (int year) {
        int days=0;
        if (year%400==0) {days=366;}
        else if (year%100==0){days=365;}
        else if (year%4==0){days=366;}
        else {days=365;}

    return days;}
}