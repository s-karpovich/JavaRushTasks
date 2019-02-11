package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.Scanner;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // using InputStreamReader:
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nString = bf.readLine();
        int n = Integer.parseInt(nString);
        System.out.println( "Я буду зарабатывать $" + n + " в час");

        // using Scanner:
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println( "Я буду зарабатывать $" + amount + " в час");
        scanner.close();
    }
}
