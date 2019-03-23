package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            FileInputStream fi = new FileInputStream(bf.readLine());
            int count = 0;
            while (fi.available() > 0) {
                fi.read();
                count++;
            }
            if (count < 1000) {
                bf.close();
                fi.close();
                throw new DownloadException();
            }
        }
    }
    public static class DownloadException extends Exception {

    }
}
