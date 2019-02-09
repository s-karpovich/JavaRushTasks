package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

import static java.lang.String.valueOf;

public class Solution {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //напишите тут ваш код
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sum += i;
            if (i == 1) {
                 sb.append(i);
                System.out.println(sb);
                continue;
            }
            sb.append("+").append(i);
            //System.out.println(sb+"="+sum);
            System.out.println(sb.toString().concat("=").concat(valueOf(sum)));


        }
        long timeSpent = System.currentTimeMillis()-startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
