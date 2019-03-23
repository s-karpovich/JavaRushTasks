package mytests;

public class test1 {
    //напишите тут ваш код

    public static void main(String[] args) {
        Object[] arr = new Object[3];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        arr = null;
        //System.out.println(arr[1]); - NullPointerException

        int g = 120;
        byte v = (byte) g;
        System.out.println("***"+v);

        Integer a = 129;
        Integer b = 129;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("------");
        String x = "1299";
        String y = "1299";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("******");
        String k = new String("1000");
        String l = new String("1000");
        String m = "1000";
        System.out.println(k == l);
        System.out.println(k.equals(l));
        System.out.println(l == m);
        System.out.println(l.equals(m));
    }
}