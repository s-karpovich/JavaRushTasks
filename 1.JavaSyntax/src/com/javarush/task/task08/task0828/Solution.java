package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"January");
        hashMap.put(2,"February");
        hashMap.put(3,"March");
        hashMap.put(4,"April");
        hashMap.put(5,"May");
        hashMap.put(6,"June");
        hashMap.put(7,"July");
        hashMap.put(8,"August");
        hashMap.put(9,"September");
        hashMap.put(10,"October");
        hashMap.put(11,"November");
        hashMap.put(12,"December");


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String month =bf.readLine();
        for (Map.Entry<Integer, String> pair : hashMap.entrySet()) {
            String value = pair.getValue();
            int key = pair.getKey();
            if (month.equals(value)) {
                System.out.println(value + " is the " + key + " month");
            }
        }

    }
}
