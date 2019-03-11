package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 0;
    }

    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + RussianHen.RUSSIA + ". " +
                "Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        System.out.println(s);
        return s;
    }
}
