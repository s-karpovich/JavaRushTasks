package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bf.readLine());
        }
        int min = list.get(0).length();
        int max = list.get(0).length();

        // можно решить через получение и вывод индексов минимума и максимума
        for (String s : list) {
            if (s.length() > max) max = s.length();
            if (s.length() < min) min = s.length();
        }

        // можно вывести элемент с наименьшим индексом
        for (String s : list) {
            if (s.length() == min || s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
