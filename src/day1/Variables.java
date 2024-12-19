package day1;

public class Variables {

    // Instance static Variables no value assigned
    static int random;
    static String str;
    static boolean flag;


    public static void main(String[] args) {
        // dataType variable_name = value ; -> Syntax of creating a variable
        int num; // Initialization;
        num = 10; // Declaration;

        // (OR)

        int num1 = 215;  // Initialization + Decalartion in a single line of code;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num + " " + num1);

        byte a = 111;
        short b = 1234;
        int number = 121212;
        long mobile = 7817189010L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(number);
        System.out.println(mobile);

        num = 25; // Updating a varibale value;
        num1 = num + a;

        System.out.println("Updated Value of num and num1 are :");
        System.out.println(num);
        System.out.println(num1);


        // No values assigend to below variables at class level , lets see their output in console
        // These values are default values assigned to the varibale binded to the dataType they are


        System.out.println(random);
        System.out.println(str);
        System.out.println(flag);

        System.out.println();

        // Valid Variable names
        int $num = 0;
        int _n = 12;
        int hey_ui = 8;
        int hey$$__yu = 3244;
        int $_hu = 121;
        String str_new = "Hello";


        // Printing numbers
        System.out.println(34);
        System.out.println(34 + 17);
        System.out.println(34 * 16);
        System.out.println(34 / 17);

        // Printing Text
        System.out.println("Hello");
        System.out.println("New World");
        System.out.println("'Hello'");

        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        int n1 = 5, n2 = 6, n3 = 50;
        System.out.println(n1 + n2 + n3);

        // Area of rectagle using Variables

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);



    }


}
