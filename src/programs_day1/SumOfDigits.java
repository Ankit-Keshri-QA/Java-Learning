package programs_day1;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int sum = 0;

        System.out.println("Number is: " + num);
        while (num != 0) {
            int temp =  num % 10;
            sum = sum + temp;
            num = num / 10;
        }

        System.out.println("The sum of digits is: " + sum);

    }
}
