package programs_day1;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count = 0;

        System.out.println("Number is: " + num);
        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("The number of digits is: " + count);


    }
}
