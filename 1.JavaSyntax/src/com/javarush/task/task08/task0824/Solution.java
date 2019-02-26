package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Child1", true, 6);
        Human child2 = new Human("Child2", true, 7);
        Human child3 = new Human("Child3", false, 8);
        Human father = new Human("Father", true, 35, child1, child2, child3);
        Human mother = new Human("Mother", false, 35, child1, child2, child3);
        Human grandFather1 = new Human("GrandFather1", true, 62, father);
        Human grandMother1 = new Human("GrandMother1", false, 60, father);
        Human grandFather2 = new Human("GrandFather2", true, 63, mother);
        Human grandMother2 = new Human("GrannyMother2", false, 61, mother);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());

        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());


    }

    public static class Human {
        public String name;
        public int age;
        public boolean sex;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child);
        }

        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3) {
            super();
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child1);
            this.children.add(child2);
            this.children.add(child3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

    }
}

