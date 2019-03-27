package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        //BufferedReader fr = new BufferedReader(new FileReader("e:/file1.txt"));
        Map<String, Double> map = new TreeMap<>();
        while (fr.ready()) {
            String s = (fr.readLine());
            String[] line = s.trim().split("\\s+");
            if (!map.containsKey(line[0])) {
                map.put(line[0], Double.parseDouble(line[1]));
            } else {
                map.put(line[0], map.get(line[0]) + Double.parseDouble(line[1]));
            }
        }
        fr.close();
        Double max = Collections.max(map.values());

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

