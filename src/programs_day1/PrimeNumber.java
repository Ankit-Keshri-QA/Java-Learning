package programs_day1;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean flag = true; // We are assuming num is prime hence true

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false; // B
                break;
            }
        }

        if (flag)
            System.out.println(num + " is a prime number ..");
        else
            System.out.println(num + " is not  a prime number ..");
    }
}
