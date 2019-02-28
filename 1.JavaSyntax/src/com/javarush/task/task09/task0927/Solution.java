package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("кот1", new Cat("Васька"));
        map.put("кот2", new Cat("Петька"));
        map.put("кот3", new Cat("Борька"));
        map.put("кот4", new Cat("Мурзик"));
        map.put("кот5", new Cat("Тузик"));
        map.put("кот6", new Cat("Бобик"));
        map.put("кот7", new Cat("Ванька"));
        map.put("кот8", new Cat("Пушок"));
        map.put("кот9", new Cat("Гребешок"));
        map.put("кот10", new Cat("Душок"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();

        for (Cat cat : map.values()) {
            set.add(cat);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
