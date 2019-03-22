package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        // Считываем с консоли путь к файлу
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        // Создаем поток чтения байт из файлов
        FileInputStream fi = new FileInputStream(fileName);


        // Читайем байты из потока и добавляем в список list
        while (fi.available() > 0) {
            int data = fi.read();
            list.add(data);
        }
        // Проверяем частоту каждого элемента в списке при помоще Collections.frequency и находим максимальную частоту
        int maxFrequency=0;
        for (Integer integer : list) {
            if (Collections.frequency(list, integer) > maxFrequency) {
                maxFrequency = Collections.frequency(list, integer);
            }
        }
        // Находим элементы (байты) с максимальной частотой maxFrequency и
        // формируем уникальное множество HashSet (без повторений в соответствии с условими задачи)
        for (Integer integer : list) {
            if(Collections.frequency(list, integer)==maxFrequency) {
                set.add(integer);
            }
        }
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
        // Закрываем потоки
        bf.close();
        fi.close();
    }
}
