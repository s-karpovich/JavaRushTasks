package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        for (int i = 0; i <3 ; i++) {
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
// Old
//        int thirdNum=number/100;
//        //int second=(number-thirdNum*100)/10;
//        int secondNum = (number%100)/10;
//        int firstNum = (number%100)%10;
//        return thirdNum + secondNum + firstNum;
    }
}
