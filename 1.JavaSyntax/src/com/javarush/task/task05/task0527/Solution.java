package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat ("Tom", 5, 3);
        Dog bullDog = new Dog ("BullDog", 6, 6);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //напишите тут ваш код
    public static class Dog {
        private String name;
        private int weight, age;

        public Dog (String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }

    public static class Cat {
        private String name;
        private int weight, age;

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }
}
