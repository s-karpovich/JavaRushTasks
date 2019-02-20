package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for (int i =arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }
}

