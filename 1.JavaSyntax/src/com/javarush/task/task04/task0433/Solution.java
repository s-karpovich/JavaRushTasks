package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i=0;
        int j = 0;
        String s = "S";
        StringBuilder sb=new StringBuilder();

        while (i<10) {
            sb.append(s);
            i++;
        }

        while (j<10) {
            System.out.println(sb);
            j++;
        }
    }
}
