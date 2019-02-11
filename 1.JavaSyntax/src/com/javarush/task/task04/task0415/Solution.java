package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String aS = bf.readLine();
        String bS = bf.readLine();
        String cS = bf.readLine();

        int a = Integer.parseInt(aS);
        int b = Integer.parseInt(bS);
        int c = Integer.parseInt(cS);

        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}