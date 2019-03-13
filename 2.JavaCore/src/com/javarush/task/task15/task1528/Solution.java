package com.javarush.task.task15.task1528;

/* 
ООП. Hrivna — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {

        private double amount = 123d;

        @Override
        public Object getAmount() {
            return amount;
        }

        public Hrivna getMoney() {
            return this;
        }
    }
}
