package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman1 = new Woman("Зоя",  55, "Рокоссовского 2");
        Woman woman2 = new Woman("Федора",  90, "Рокоссовского 2");
        Man man1 = new Man("Вася", 18,"Рокоссовского 1");
        Man man2 = new Man("Коля", 40,"Рокоссовского 1");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
    }

    //напишите тут ваш код
    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}