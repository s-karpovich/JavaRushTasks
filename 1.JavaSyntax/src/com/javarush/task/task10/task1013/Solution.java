package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, surname;
        private int age, height, weight;
        private char sex;

        public Human(String name, String surname, int age, int height, int weight, char sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;

        }
        public Human(String name, String surname, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname, int height, int weight, char sex) {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String surname, int weight, char sex) {
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String surname, char sex) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }
        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }
    }
}
