package com.javarush.task.task04.task0401;

/* 
Мне не подходит этот возраст…
*/
public class NewAge {
    public static void main(String[] args) {
        Age age = new Age();
        System.out.println("age1 " + age.age);
        age.age(age.age);
        System.out.println("age2 " + age.age);
    }
    public static class Age {
        int age = 20;
        void age(int age) {
            this.age = age + 20;
            System.out.println("age3 " + age);
        }
    }
}



//    Person person = new Person();
//        System.out.println("Age is: " + person.age);
//        person.adjustAge(person.age);
//        System.out.println("Adjusted age is: " + person.age);
//    }
//
//    public static class Person {
//        public int age = 20;
//
//        public void adjustAge(int age) {
//
//            this.age = age + 20;
//            System.out.println("Age in adjustAge() is: " + this.age);
//        }
//    }

