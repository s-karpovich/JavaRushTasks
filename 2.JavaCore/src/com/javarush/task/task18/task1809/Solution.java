package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fi1 = new FileInputStream(bf.readLine());
        FileOutputStream fi2 = new FileOutputStream(bf.readLine());
        List<Integer> list = new ArrayList<>();

        while (fi1.available() > 0) {
            list.add(fi1.read());
        }
        for (int i = list.size()-1; i >=0; i--) {
            fi2.write(list.get(i));
        }
        fi1.close();
        fi2.close();
        bf.close();
    }
}
