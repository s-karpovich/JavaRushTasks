package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        if (a < 1 || b < 1) throw new Exception();

        int minNum;
        if (a < b) {
            minNum = a;
        } else {
            minNum = b;
        }

        int nod = 1;
        int maxNod = 1;
        for (int i = 1; i <= minNum; i++) {
            if (a % i == 0 && b % i == 0) nod = i;
            if (nod > maxNod) {
                maxNod = nod;
            }

        }
        System.out.println(maxNod);
    }
}
