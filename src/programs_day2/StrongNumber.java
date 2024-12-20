package programs_day2;

public class StrongNumber {

    public static void main(String[] args) {
        // Input :- 145
        // Sum of 1! , 4! , 5! = 145
        // Hence Sum of Factorial == Input

        int num = 145, sum = 0, fact = 1;
        int num1 = num;
        while (num > 0) {
            int temp = num % 10;
            for (int i = 1; i <= temp; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
            fact = 1;
        }

        System.out.println("Your input is " + num1);
        System.out.println("Sum of the factorials of digits is: " + sum);

        if (sum == num1)
            System.out.println(num1 + " is a strong number ...");
        else
            System.out.println(num1 + " is not a strong number ...");
    }
}
