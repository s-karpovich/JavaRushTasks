package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min = a;
        min = b < min ? b : min;
        min = c < min ? c : min;
        min = d < min ? d : min;
        min = e < min ? e : min;
        return min;

        // return (a<b) ? ((a<c) ? a : c) : ((b<c) ? b : c); - minimum of 3 numbers via ternary operator
        // minimum of 5 numbers via ternary operator:
        //return a < b ? (a < c ? (a < d ? (a < e ? a : e) : (d < e ? d : e)) : (c < d ? (c < e ? c : e) : (d < e ? d : e))) : (b < c ? (b < d ? (b < e ? b : e) : (d < e ? d : e)) : (c < d ? (c < e ? c : e) : (d < e ? d : e)));

    }
}