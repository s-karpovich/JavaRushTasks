package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, 1,4, 5, 22, 11, 3, 2, 7, 9, 0, 24, 23, 100, 6, 120, 122, 142, 129, 999, 1000);
    return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код

        // Удаление через removeIf и лямбды
         //set.removeIf(elem -> elem > 10);

         //Удаление через итератор
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
        if (it.next()>10) it.remove();
        }

   return set;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersGreaterThan10(createSet()).toString());
    }
}
