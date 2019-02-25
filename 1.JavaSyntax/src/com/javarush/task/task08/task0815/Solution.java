package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Груздев", "Алексей");
        hashMap.put("Александров", "Андрей");
        hashMap.put("Драгун", "Андрей");
        hashMap.put("Бага", "Дмитрий");
        hashMap.put("Рональдо", "Андрей");
        hashMap.put("Месси", "Андрей");
        hashMap.put("Агуэро", "Серхио");
        hashMap.put("Путин", "Владимир");
        hashMap.put("Кокорин", "Андрей");
        hashMap.put("Петров", "Андрей");
    return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
