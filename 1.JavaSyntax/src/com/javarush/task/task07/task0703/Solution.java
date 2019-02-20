package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        // Заполняем массив строк с клавиаутыр и массив чисел количеством элементов в каждой строке
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = bf.readLine();
            intArray[i] = stringArray[i].length();
        }
        // Выводим масив чисел на экран
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
