package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Rembo", df.parse("JANUARY 21 1981"));
        map.put("Spiderman", df.parse("JUNE 1 1960"));
        map.put("Batman", df.parse("FEBRUARY 1 1961"));
        map.put("Santa", df.parse("DECEMBER 1 1950"));
        map.put("Terminator", df.parse("JUNE 1 1980"));
        map.put("Putin", df.parse("OCTOBER 1 1930"));
        map.put("Lenin", df.parse("OCTOBER 1 1910"));
        map.put("Trump", df.parse("AUGUST 1 1990"));
        map.put("Bruce", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();

            String value = pair.getValue().toString();
            if (value.contains("Jun") || value.contains("Jul") || value.contains("Aug")) {
                it.remove();
            }
        }
       // System.out.println(map.toString());
    }

    public static void main(String[] args) throws ParseException {
    //removeAllSummerPeople(createMap());
    }
}
