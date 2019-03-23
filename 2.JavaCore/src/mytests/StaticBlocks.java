package mytests;

public class StaticBlocks {

/*
Порядок загрузки переменных
*/

    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public String name = "First name";
    public int i = 6;


    public StaticBlocks() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        StaticBlocks s = new StaticBlocks();
    }

    public static void printAllFields(StaticBlocks obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}





