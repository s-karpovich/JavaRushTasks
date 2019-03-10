package com.javarush.task.task14.task1405;

/* 
Food
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onEat();     // Вызываем метод onEat() класса Food
        food.onSelect();  // Вызываем метод onSelect() переопределенный в классе Food
    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();  // Вызываем метод onSelect() интерфейса Selectable
        // selectable.onEat();  - Метод onEat() из класса, реализующего интерфейс не может быть вызван!
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {   // Имплементируем интерфейс Selectable
        public void onEat() { System.out.println("The food was eaten"); }


        // Реализуем метод интерфейса
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
