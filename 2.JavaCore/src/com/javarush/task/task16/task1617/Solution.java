package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                for (int i = numSeconds; i >= 1; i--) {
                    System.out.print(i + " ");
                    Thread.sleep(1000);
                    numSeconds--;
                }
                System.out.print("Марш!");
            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }

        }
    }
}

