package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + UkrainianHen.UKRAINE + ". " +
                "Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        System.out.println(s);
        return s;

    }
}