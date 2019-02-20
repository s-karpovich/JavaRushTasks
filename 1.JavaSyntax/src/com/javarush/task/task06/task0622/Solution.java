package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        // Заполнение массива с клавиатуры
        int[] array = new int[5];
        for (int i = 0; i <5 ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        // Сортировка элементов массива пузырьком по возрастанию
        for (int i = array.length-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // Вывод элементов массива с новой строки
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }

}

