package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");

        // Вывод через foreach
        System.out.println(list.size());
        for (String s: list) {
            System.out.println(s);
        }
        // Вывод через for i
//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}
