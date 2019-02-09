package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    private static int sumDigitsInNumber(int number) {
       int thirdNum=number/100;
       int secondNum = (number%100)/10;
       int firstNum = (number%100)%10;

//        String s = Integer.toString(number);
//        char s1 = s.charAt(0);
//        char s2 = s.charAt(1);
//        char s3 = s.charAt(2);
//        int ns1 = Character.getNumericValue(s1);
//        int ns2 = Character.getNumericValue(s2);
//        int ns3 = Character.getNumericValue(s3);
//

       return thirdNum + secondNum + firstNum;
    }  
}