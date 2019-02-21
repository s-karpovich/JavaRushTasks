package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Федор", true, 65);
        Human grandFather2 = new Human("Петр", true, 62);

        Human grandMother1 = new Human("Валентина", false, 64);
        Human grandMother2 = new Human("Анастасия", false, 61);

        Human father = new Human("Дима", true, 25, grandFather1, grandMother1);
        Human mother = new Human("Лена", false, 24, grandFather2, grandMother2);

        Human son1 = new Human("Дениска", true, 4, father, mother);
        Human son2 = new Human("Наташенька", false, 6, father, mother);
        Human son3 = new Human("Коленька", true, 8, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}