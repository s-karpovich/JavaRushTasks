package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int[][] table = new int[11][11];
        for (int i=1; i<=10;i++){
            for (int j = 1; j <=10 ; j++) {
              table[i][j]=i*j;
            }
        }
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(table[i][j]);
                if (j!=10) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
