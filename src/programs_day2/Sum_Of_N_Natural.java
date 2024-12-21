package programs_day2;

import java.util.Scanner;

public class Sum_Of_N_Natural {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range of number: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of " + num + " natural numbers is: " + sum);
    }
}
