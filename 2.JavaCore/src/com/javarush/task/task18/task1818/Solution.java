package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fi1 = new FileOutputStream(bf.readLine(),true);
        FileInputStream fi2 = new FileInputStream(bf.readLine());
        FileInputStream fi3 = new FileInputStream(bf.readLine());

        while (fi2.available()>0){
            int data = fi2.read();
            fi1.write(data);
        }

        while (fi3.available()>0){
            int data = fi3.read();
            fi1.write(data);
        }

        bf.close();
        fi1.close();
        fi2.close();
        fi3.close();
    }
}
