package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String minutesS=bf.readLine();
        double time = Double.parseDouble(minutesS);

        if (time>60){
            time = time%60;
        }
        System.out.println(checkColor(time));
    }

    public static String checkColor(double time) {
        String color="";
        double now = time % 5;
        if (now >= 0 && now < 3) {
            color = "зеленый";

        } else if (now >=3 && now < 4) {
            color = "желтый";

        } else if (now >= 4 && now < 5) {
            color = "красный";
        }
        return color;
    }
}