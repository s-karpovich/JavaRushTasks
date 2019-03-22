package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bf.readLine();
        String name2 = bf.readLine();
        String name3 = bf.readLine();

        FileInputStream fi1 = new FileInputStream(name1);
        FileOutputStream fi2 = new FileOutputStream(name2);
        FileOutputStream fi3 = new FileOutputStream(name3);

        byte[] buffer = new byte[fi1.available()];
        while (fi1.available() > 0) {
            int count = fi1.read(buffer);
            if (count % 2 == 0) {
                fi2.write(buffer, 0, count / 2);
                fi3.write(buffer, count / 2, count / 2);
            } else {
                fi2.write(buffer, 0, count / 2 + 1);
                fi3.write(buffer, count / 2 + 1, count / 2);
            }
        }
        bf.close();
        fi1.close();
        fi2.close();
        fi3.close();
    }
}
