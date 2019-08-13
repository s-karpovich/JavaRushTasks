package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] arr = new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = arr.length-1; i>0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
