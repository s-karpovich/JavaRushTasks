package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static class Goose extends SmallAnimal {
        public String getSize() {
            String s = "Гусь маленький, " + super.getSize();
            System.out.println(s);
            return s;
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            String s = "Дракон большой, " + super.getSize();
            System.out.println(s);
            return s;
        }
    }

    public static void main(String[] args) {
        Goose goose = new Goose();
        goose.getSize();
        Dragon dragon = new Dragon();
        dragon.getSize();
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }


}