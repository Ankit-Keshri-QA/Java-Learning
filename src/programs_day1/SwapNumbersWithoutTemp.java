package programs_day1;

public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " and " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a + " and " + b);

        // Other Logics

        /*
        a = a + b;
        b = a - b;
        a = a - b; */

    }

}
