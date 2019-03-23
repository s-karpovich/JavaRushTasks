package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Получаем имя файла в поток
        FileInputStream fi = new FileInputStream(args[0]);
        int count=0;
        while (fi.available()>0) {
            // Читаем байты из файла и присваиваем в переменную data
            int data = fi.read();
            // Приводим байты к символам
            char c = (char) data;
            // Проверяем соответствует ли символ английскому алфавиту
            if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z'))){
                count++;
            }

        }
        // Выводим количество
        System.out.println(count++);
        fi.close();
    }
}
