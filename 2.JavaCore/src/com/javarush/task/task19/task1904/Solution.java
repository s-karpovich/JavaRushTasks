package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {


    public static void main(String[] args) throws IOException, ParseException {
    PersonScanner ps = new PersonScannerAdapter(new Scanner(System.in));
        System.out.println(ps.read().toString());
    }

    public static class PersonScannerAdapter implements PersonScanner{
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
        private Scanner fileScanner;

        @Override
        public Person read() throws IOException, ParseException {
         DateFormat format = new SimpleDateFormat("dd MM yyyy");
         String s = this.fileScanner.nextLine();
           // String s = "Иванов Иван Иванович 31 12 1950";
         String[] arr = s.trim().split("\\s+");
         String birthday = arr[3]+" " + arr[4]+" "+arr[5];

        return new Person(arr[1], arr[2], arr[0], format.parse(birthday));}

        @Override
        public void close() throws IOException {
        this.fileScanner.close();
        }
    }
}
