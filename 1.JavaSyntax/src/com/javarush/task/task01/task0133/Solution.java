package com.javarush.task.task01.task0133;

/* https://javarush.ru/tasks/com.javarush.task.task01.task0133#discussion
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int minutes2=30;
        int minutes1=0;
        int hours2=15;
        int hours1=15;
        final int hSec=3600;
        final int minSec=60;
        
        int secondsAfter15 = (hours2-hours1)*hSec + (minutes2-minutes1)*minSec;
        System.out.println(secondsAfter15);
    }
}