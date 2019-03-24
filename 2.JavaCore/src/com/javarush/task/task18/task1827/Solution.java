package com.javarush.task.task18.task1827;

/* 
Прайсы
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //Test block
//        String fileName = "e:/out.txt";
//        String[] argss = new String[4];
//        argss[0] = "-c";
//        argss[1] = "Шорты пляжные синие   ";
//        argss[2] = "122.01 ";
//        argss[3] = "5555";

        // Checks for command (-c) and for arguments existing
        if (args.length==4 && args[0].equals("-c")) {
            StringBuilder id = new StringBuilder(8); // Capacity = parameter size
            StringBuilder productName = new StringBuilder(30);
            StringBuilder price = new StringBuilder(8);
            StringBuilder quantity = new StringBuilder(4);
            StringBuilder sb = new StringBuilder();

            // Fills parameters (stringBuilders) with necessary spaces
            fill(findId(fileName), id);
            fill(args[1], productName);
            fill(args[2], price);
            fill(args[3], quantity);
            // Prepares text for writing from to write from a new line
            sb.append("\r\n").append(id).append(productName).append(price).append(quantity);
            // Writes the text to a file
            writeFile(fileName, sb.toString());
        } else {return;}
    }
    // Finds maximum ID record, add+1 and return as String
    public static String findId(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int max=0;
        while (true) {
            String text = reader.readLine();
            if (text == null) { break; }
            else { int id =  Integer.parseInt(text.substring(0, 8).trim());  // Parses id (8 letters), trims spaces
            if (id>max) {max=id;}}
        }
        reader.close();
        return String.valueOf(max + 1);
    }

    // Adds spaces if necessary
    public static void fill(String arg, StringBuilder sb) {
        for (int i = 0; i < sb.capacity(); i++) {
            if (i < arg.length()) { sb.append(arg.charAt(i)); }
            else { sb.append(' '); }
        }
    }

    public static void writeFile(String fileName, String text) throws IOException {
        // write file using FileOutputStream
        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        byte[] bytes = text.getBytes();
        outputStream.write(bytes);
        outputStream.close();    // ! closes writing Stream

        // write file using FileWriter
//        FileWriter writer = new FileWriter(fileName, true);
//        writer.write(text);
//        writer.close();
//        System.out.println("DONE");
    }

    // !!!USING JAVA 8 and lambdas!!!
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        List<String> strings = Files.readAllLines(Paths.get(name));
//
//        switch (args[0]) {
//            case "-c": {
//                int idMax = strings
//                        .stream()
//                        .map(s -> s.substring(0, 8).trim())
//                        .mapToInt(Integer::parseInt)
//                        .max()
//                        .getAsInt();
//                strings.add(String.format("%-8s%-30s%-8s%-4s", ++idMax, args[1], args[2], args[3]));
//            }
//        }
//        Files.write(Paths.get(name), strings);
//    }


}


