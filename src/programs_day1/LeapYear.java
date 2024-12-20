package programs_day1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // An year which is divisible by 4 is a leap year
        // An year which is divisible by both 100 and 400 is a leap year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0)
                System.out.println(year + " is a leap year ..");
            else if (year % 100 == 0 && year % 400 == 0)
                System.out.println(year + " is a leap year ...");
            else
                System.out.println(year + " is not a leap year ..");
        } else
            System.out.println(year + " is not a leap year ");

    }
}
