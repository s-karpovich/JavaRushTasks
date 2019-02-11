package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String amountS=bf.readLine();
        int amount = Integer.parseInt(amountS);

        if (amount<0){
            System.out.println(amount+1);
        }
        if (amount==0){
            System.out.println(amount);
        } if (amount>0) {
            System.out.println(amount*2);
        }
    }

}