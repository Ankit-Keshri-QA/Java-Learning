package programs_day1;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        //  CI = P × (1 + R/100)^T - P
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal : ");
        int p = sc.nextInt();
        System.out.println("Enter the rate : ");
        int r = sc.nextInt();
        System.out.println("Enter the time : ");
        int t = sc.nextInt();

        double ci = p * Math.pow((1 + r / 100), t);

        System.out.println("Your principal amount invested is: " + p);
        System.out.println("The compound interest earned over time " + t + " years is: " + ci);


    }

}
