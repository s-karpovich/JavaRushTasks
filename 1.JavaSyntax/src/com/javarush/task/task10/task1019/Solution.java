package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<>();


        while (true) {
            String idS = reader.readLine();
            String name = reader.readLine();

            if (name.isEmpty() || idS.isEmpty()) {break;}
            map.put(Integer.parseInt(idS), name);
        }

        for(Map.Entry<Integer, String> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
