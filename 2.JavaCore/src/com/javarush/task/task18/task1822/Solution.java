package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bi = new BufferedReader(new InputStreamReader(new FileInputStream(bf.readLine()), "UTF-8"));

        String line;
        while ((line = bi.readLine()) != null) {
            int index = 0;
            char[] arr = line.toCharArray();
            // Находим индекс пробела
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' ') {
                    index = i;
                    break;
                }
            }
            // Проверяем подстроку до индекса пробела(не включая) на соответствие переданному аргументу
            if (args[0].equals(line.substring(0, index))) {
                System.out.println(line);
                break;
            }
        }
        bf.close();
        bi.close();
    }
}