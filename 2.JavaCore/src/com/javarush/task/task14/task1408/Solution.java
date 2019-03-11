package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        hen2.getCountOfEggsPerMonth();
        hen2.getDescription();
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen3.getCountOfEggsPerMonth();
        hen3.getDescription();
        Hen hen4 = HenFactory.getHen(Country.RUSSIA);
        hen4.getCountOfEggsPerMonth();
        hen4.getDescription();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.BELARUS))
            hen= new BelarusianHen();
            else if (country.equals(Country.MOLDOVA))
                hen= new MoldovanHen();
            else if (country.equals(Country.UKRAINE))
                hen= new UkrainianHen();
           else if (country.equals(Country.RUSSIA))
                hen= new RussianHen();
            return hen;
        }
    }
}
