package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }

        for (Integer num : list) {
            if (num % 3 == 0 && num % 2 == 0) {
                list3.add(num);                 // Записываем в оба списка числа, которые делятся нацело на 3 и на 2
                list2.add(num);
            } else if (num % 3 == 0) {          //// Записываем во первый список только числа, делящиеся без остатка на 3
                list3.add(num);
            } else if (num % 2 == 0) {
                list2.add(num);                 // Записываем во второй список только числа, делящиеся без остатка на 2
            } else listOther.add(num);          // Все остальные записываем третий список
        }

        printList(list3);
       // System.out.println("***");
        printList(list2);
       // System.out.println("***");
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        for (Integer num : list) System.out.println(num);
    }
}
