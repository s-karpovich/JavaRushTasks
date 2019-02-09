package com.javarush.task.task04.task0402;

/* 
Цена яблок
*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        static int applesPrice = 0;

       static void addPrice(int applesPrice) {
            applesPrice = Apple.applesPrice + applesPrice;

            Apple.applesPrice += applesPrice;
        }
    }
}
