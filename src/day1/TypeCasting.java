package day1;

public class TypeCasting {

    public static void main(String[] args) {
        char a = 65;
        char b = 97;
        System.out.println(a + " " + b);

        int number = 69;
        char ch = (char) number; // Explicit Type Casting from int to char

        System.out.println(ch);
        a++;
        b++; // Increment
        System.out.println(a + " " + b);

        int x = 10;
        int y = 20;
        double z = x + y; // Automatic Type Casting as double is bigger than int
        System.out.println("x + y is " + z);


        int q = 12;
        String k = "Hi ";
        System.out.println(k + q);

        System.out.println("\"Hello\" Everyone");

        int i = 100;
        long l = i;
        System.out.println(l);
        double dd = i;
        System.out.println(dd);
        byte bb = (byte) i; // Implicit TC
        System.out.println(bb);
    }
}
