package programs_day1;

public class FibonacciSeries {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 1;
        int counter = 8;
        System.out.println("Printing Fibonacci series below ..");
        System.out.print(num1 + " " + num2 + " " + num3 + " ");

        for (int i = 0; i < counter; i++) {
            int num4 = num2 + num3;
            System.out.print(num4 + " ");
            num2 = num3;
            num3 = num4;

        }
    }
}
