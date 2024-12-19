package programs_day1;

public class Calculator {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println();

        int c, d;
        c = 100;
        d = 20;
        int res;

        res = c + d;
        System.out.println("Addition : " + res);

        res = c - d;
        System.out.println("Substraction : " + res);

        res = c * d;
        System.out.println("Multiply : " + res);

        res = c / d;
        System.out.println("Divide : " + res);


    }

}
