package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], df.parse(args[i + 2])));
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], df.parse(args[i + 2])));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            }

            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        Person pers = allPeople.get(Integer.parseInt(args[i]));
                        pers.setName(args[i + 1]);
                        pers.setBirthDate(df.parse(args[i + 3]));
                        if (args[i + 2].equals("м")) pers.setSex(Sex.MALE);
                        else if (args[i + 2].equals("ж")) pers.setSex(Sex.FEMALE);
                    }
                    break;
                }
            }

            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i <args.length; i++) {
                        Person pers = allPeople.get(Integer.parseInt(args[i]));
                        pers.setName(null);
                        pers.setBirthDate(null);
                        pers.setSex(null);
                    }
                    break;
                }
            }

            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person pers = allPeople.get(Integer.parseInt(args[i]));
                        String sex = pers.getSex().equals(Sex.FEMALE) ? "ж" : "м";
                        System.out.println(pers.getName() + " " + sex + " " + dfOut.format(pers.getBirthDate()));  // Выводим имя, пол и дату (используя другой формат по условию)
                    }
                    break;
                }
            }
        }
    }
}



