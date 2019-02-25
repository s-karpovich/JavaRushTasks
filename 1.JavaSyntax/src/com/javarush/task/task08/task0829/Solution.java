package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String, String> hashMap = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            hashMap.put(family, city);
        }


        String city = reader.readLine();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String value = entry.getValue();
            if (city.equals(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

