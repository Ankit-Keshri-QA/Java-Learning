package programs_day1;

import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = sc.nextInt();

        /*
        if (age >= 18)
            System.out.println("Eligible ...");
        else
            System.out.println("Not Eligible ...");
         */

        if (age >= 18)
            System.out.println("Eligible to vote...");
        else if (age < 18 && age >= 0)
            System.out.println("Not Eligible to vote ...");
        else
            System.out.println("Please enter a valid age ..");

    }
}
