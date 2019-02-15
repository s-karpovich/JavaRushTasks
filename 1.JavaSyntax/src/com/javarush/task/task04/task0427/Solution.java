package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //String aS=bf.readLine();
        //int symbols=aS.length(); !

        int a = Integer.parseInt(bf.readLine());
        if (a >= 1 && a <= 999) {
            System.out.println(checkEven(a) + " " + checkDigits(a) + " число");

        }
    }

    private static String checkEven(int a) {
        String even;
        if (a % 2 == 0) {
            even = "четное";
        } else {
            even = "нечетное";
        }
        return even;
    }

    private static String checkDigits(int a) {
        String digits = "";
        //System.out.println((Math.log10(a)));
        //System.out.println(Math.ceil(Math.log10(a)));

        if ((Math.log10(a))>=2 && (Math.log10(a)) <3) {
            digits = "трехзначное";
        } else if ((Math.log10(a))>=1 && (Math.log10(a)) <2) {
            digits = "двузначное";
        } else if ((Math.log10(a))>=0 && (Math.log10(a)) <1){
            digits = "однозначное";
        }
        return digits;
    }
}
