package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }

    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + MoldovanHen.MOLDOVA + ". " +
                "Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        System.out.println(s);
        return s;
    }
}
