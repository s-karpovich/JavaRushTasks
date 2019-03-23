package mytests;

public class Peregruzka {
    public static void main(String[] args) {
        Peregruzka.print(1);
        Peregruzka.print((byte) 2);
        Peregruzka.print("3");
        // Peregruzka.print(null);
    }
//    INT -> LONG!!!
//    public static void print(int n) {
//        System.out.println("int: " + n);
//    }

    public static void print(short n) {
        System.out.println("short: " + n);
    }

    public static void print(double n) {
        System.out.println("double: " + n);
    }

    public static void print(Integer n) {
        System.out.println("Integer: " + n);
    }

    public static void print(String s) {
        System.out.println("String: " + s);
    }


}
