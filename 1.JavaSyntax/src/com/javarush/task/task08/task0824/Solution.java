package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Child1", true, 6, null);
       Human child2 = new Human("Child2", true, 7, null);
       Human child3 = new Human("Child3", false, 8,  null);

        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(child1);
        kids.add(child2);
        kids.add(child3);


        Human father = new Human("Father", true, 35, kids);
        Human mother = new Human("Mother", false, 35, kids);

        ArrayList<Human> FirstParentsKids = new ArrayList<Human>();
        ArrayList<Human> SecondParentsKids = new ArrayList<Human>();

        FirstParentsKids.add(father);
        SecondParentsKids.add(mother);

        Human grandFather1 = new Human("GrandFather1", true, 62, FirstParentsKids);
        Human grandMother1 = new Human("GrandMother1", false, 60, FirstParentsKids);
        Human grandFather2 = new Human("GrandFather2", true, 63, SecondParentsKids);
        Human grandMother2 = new Human("GrannyMother2", false, 61, SecondParentsKids);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);

    }

    public static class Human {
        public String name;
        public int age;
        public boolean sex;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            if (this.children!=null) {
                int childCount = this.children.size();
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

