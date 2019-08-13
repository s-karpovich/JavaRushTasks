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

        if (min(a,b)<min(c,d)) { System.out.println(min(a,b));}
        else  {System.out.println(min(c,d));}
    }

    private static int min(int first, int second) {
        if (first < second) { return first; }
        else { return second; }
    }
}


//       if (a>=b && a>=c&& a>=d) {
//               System.out.println(a);
//               } else if (b>c && b>d){
//               System.out.println(b);
//               } else if (c>d){
//               System.out.println(c);
//               } else {
//               System.out.println(d);
//               }