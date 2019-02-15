package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

       if (a>=b && a>=c&& a>=d) {
           System.out.println(a);
       } else if (b>c && b>d){
           System.out.println(b);
       } else if (c>d){
           System.out.println(c);
       } else {
           System.out.println(d);
       }
    }
}
