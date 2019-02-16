package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.weight = 4;
        cat1.strength = 4;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 3;
        cat2.strength = 3;
        System.out.println(cat1.fight(cat2));

    }
}
