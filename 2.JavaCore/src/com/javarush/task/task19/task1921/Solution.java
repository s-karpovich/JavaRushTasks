package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution  {
    public static final List<Person> PEOPLE = new ArrayList<Person>();
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        while(fr.ready()) {
            String s = fr.readLine();
            //String regex = ("[а-яА-ЯёЁ]+");
            String fullName=s.replaceAll("[0-9]+","").trim();       // Удаляем цифры, обрезаем пробелы
            String numbers=s.replaceAll("[а-яА-ЯёЁ-]+", "").trim(); // Удаляем слова,включая дефисы, обрезаем пробелы
            DateFormat dfOut = new SimpleDateFormat("dd MM yyyy");
            Date birthday=dfOut.parse(numbers);                                     // Парсим дату и создаем объект
            Person person = new Person(fullName, birthday);
            PEOPLE.add(person);
        }
        fr.close();
    }
}
