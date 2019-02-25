package com.javarush.task.task08.task0813;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "Лодка", "Лоб", "Лук", "Лось", "Лис", "Лист", "Лесок", "Леска", "Лестница", "Линь",
                "Линька", "Лоск", "Ласты", "Лорд", "Лиана", "Липа", "Лот", "Леопард", "Лосось", "Лак");

        return set;
    }

    public static void main(String[] args) {
        //System.out.println(createSet().toString());

        }
    }

