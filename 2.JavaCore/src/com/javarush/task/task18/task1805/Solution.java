package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> treeSet= new TreeSet<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fi =  new FileInputStream(bf.readLine());

        while(fi.available()>0) {
            treeSet.add(fi.read());
        }
        bf.close();
        fi.close();

        for (Integer integer : treeSet) {
            System.out.print(integer + " ");
        }
    }
}
