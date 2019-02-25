package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Куклачев","Дмитрий");
        map.put("Петров","Дмитрий");
        map.put("Петров","Андрей");
        map.put("Серов","Алексей");
        map.put("Киркоров","Филипп");
        map.put("Бутусов","Андрей");
        map.put("Басков","Николай");
        map.put("Путин","Владимир");
        map.put("Жириновский","Михаил");
        map.put("Петров","Михаил");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
