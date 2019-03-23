package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader(bf.readLine()));
//        BufferedWriter brw = new BufferedWriter(new FileWriter(bf.readLine()));
//        BufferedReader br = new BufferedReader(new FileReader("e:/file1"));
//        BufferedWriter brw = new BufferedWriter(new FileWriter("e:/file2.txt"));
        FileInputStream fi = new FileInputStream(bf.readLine());
        PrintStream out = new PrintStream(new FileOutputStream(bf.readLine()));
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (fi.available() > 0) {
            char symb = (char) fi.read();
            if (symb == ' ') {
                list.add(sb.toString());
                list.add(" ");
                sb.setLength(0);
            } else {
                sb.append(symb);
            }
        }
        list.add(sb.toString());

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(" ")) {
                list.set(i, String.valueOf(Math.round(Double.parseDouble(list.get(i)))));
            }
        }

        for (String s : list) {
            sb2.append(s);
        }

        out.print(sb2.toString());
        fi.close();
        out.close();
        bf.close();
    }
}

//        //System.out.print(sb);
//        System.out.println("*****");
//        String regexp = ("\\d+(\\.\\d+)?");
//        Pattern pattern = Pattern.compile(regexp);
//        Matcher matcher = pattern.matcher(sb);
//
//        String result = "";
//        String ss = sb.toString();
//        List<String> list = new ArrayList<>();
//
//        while (matcher.find()) {
//
//            //System.out.print(matcher.group()+" ");
//            //System.out.println();
//
//            String a = String.valueOf(Math.round(Double.parseDouble(matcher.group())));
//
//            list.add(a);
//            //System.out.println(a);
//
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        while (matcher.find())
//            for (int i = 0; i < matcher.groupCount(); i++) {
//                ss = ss.replace(matcher.group(), list.get(i));
//            }
//
//
//        //  result = matcher.replaceFirst(String.valueOf(Math.round(Double.parseDouble(matcher.group(0)))));    }
//
//        // result = matcher.replaceAll (String.valueOf(Math.round(Double.parseDouble(matcher.group()))));
//
//
//        //System.out.println();
//        // System.out.println("****");
//        System.out.println(result);


