package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Петров", "Андрей");
        hashMap.put("Сидоров", "Лев");
        hashMap.put("Козлов", "Григорий");
        hashMap.put("Пушкин", "Алексанр");
        hashMap.put("Карамзин", "Андрей");
        hashMap.put("Толстой", "Лев");
        hashMap.put("Худой", "Тигр");
        hashMap.put("Конский", "Дмитрий");
        hashMap.put("Бельский", "Николай");
        hashMap.put("Соснов", "Сергей");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        int count = 0;

        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();

            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
                if (pair1.getValue().equals(value)) {
                    count += 1;
                    if (count > 1) {
                        removeItemFromMapByValue(map, value);
                        }
                  }

            }
            count =0;
        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}
