package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("May 1 2000"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        //System.out.println(Integer.parseInt(new SimpleDateFormat("D").format(new Date(date))));
        return Integer.parseInt(new SimpleDateFormat("D").format(new Date(date))) % 2 != 0;
    }
}
