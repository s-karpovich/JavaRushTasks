package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + BelarusianHen.BELARUS + "." +
                " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        System.out.println(s);
        return s;
    }
}
