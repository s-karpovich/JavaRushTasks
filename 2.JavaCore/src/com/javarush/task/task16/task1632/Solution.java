package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new Tr1();
        Thread thread2 = new Tr2();
        Thread thread3 = new Tr3();
        Thread thread4 = new Tr4();
        Thread thread5 = new Tr5();

        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) {
    }

    public static class Tr1 extends Thread {
        @Override
        public void run() {
            while (true) {
                super.run();
            }
        }
    }

    public static class Tr2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }


    public static class Tr3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Tr4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {
                super.run();
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Tr5 extends Thread {
        @Override
        public void run() {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                String s = "";
                try {
                    s = bf.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s.equals("N")) break;
                sum = sum + Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}