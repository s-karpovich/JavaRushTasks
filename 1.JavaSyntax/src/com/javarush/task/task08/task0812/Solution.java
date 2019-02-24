package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int count = 1;

        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        int max = 1;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {continue; }
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
                if (count > max) {max=count;}
            } else {
                count = 1;
            }

        }
        System.out.println(max);
    }

}
