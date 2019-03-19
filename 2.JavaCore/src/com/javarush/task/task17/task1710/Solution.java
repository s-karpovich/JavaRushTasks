package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], df.parse(args[3])));
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], df.parse(args[3])));
                }
                System.out.println(allPeople.size() - 1);
                break;
            }

            case "-u": {
                Person pers = allPeople.get(Integer.parseInt(args[1]));
                pers.setName(args[2]);
                pers.setBirthDate(df.parse(args[4]));
                if (args[3].equals("м")) pers.setSex(Sex.MALE);
                else if (args[3].equals("ж")) pers.setSex(Sex.FEMALE);
                break;
            }

            case "-d": {
                Person pers = allPeople.get(Integer.parseInt(args[1]));
                pers.setName(null);
                pers.setBirthDate(null);
                pers.setSex(null);
                break;
            }

            case "-i": {
                Person pers = allPeople.get(Integer.parseInt(args[1]));
                String sex = pers.getSex().equals(Sex.FEMALE) ? "ж" : "м";
                System.out.println(pers.getName() + " " + sex + " " + dfOut.format(pers.getBirthDate()));  // Выводим имя, пол и дату (используя другой формат по условию)
                break;
            }
        }
    }
}



