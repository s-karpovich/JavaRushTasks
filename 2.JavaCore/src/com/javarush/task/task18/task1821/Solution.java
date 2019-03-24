package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream input= new FileInputStream(args[0]);
        List<Character> list = new ArrayList<>();
        Set<Character> treeSet = new TreeSet<>();



        StringBuilder sb = new StringBuilder();
        while(input.available()>0) {
          list.add((char) input.read());
        }
        input.close();

        treeSet.addAll(list);

        for (Character character : treeSet) {
            System.out.println(character+" "+Collections.frequency(list, character));
        }
    }
}
