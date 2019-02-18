package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    private static int even;
    private static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        // s.toCharArray();
        int num = Integer.parseInt(s);


        for (int i = 0; i < s.length(); i++) {
            int digitPlace = (int) (num / Math.pow(10, i));
            //System.out.println(digitPlace);

            if (digitPlace % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
