package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(bf.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s: result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i <list.size(); i++) {
            list.add(i, list.get(i));   // Добавляем элемент на то же место
            i++;                        // Увеличиваем i на 1, чтобы не учитывать добавленный элемент
        }
        return list;
    }
}
