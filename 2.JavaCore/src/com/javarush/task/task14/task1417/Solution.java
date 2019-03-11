package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
            Hrivna hrivna = new Hrivna(1000);
            USD usd = new USD(2000);
            Ruble ruble = new Ruble(3000);

            this.allMoney.add(hrivna);
            this.allMoney.add(usd);
            this.allMoney.add(ruble);

            // allMoney.addAll(Arrays.asList(new Hrivna(1000),new Ruble(2000),new USD(3000)));

        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
