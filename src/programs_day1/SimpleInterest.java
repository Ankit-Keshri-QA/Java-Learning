package programs_day1;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal : ");
        int p = sc.nextInt();
        System.out.println("Enter the rate : ");
        int r = sc.nextInt();
        System.out.println("Enter the time : ");
        int t = sc.nextInt();

        int si = (p * r * t) / 100;

        System.out.println("Your principal amount invested is: "+p);
        System.out.println("The simple interest earned over time "+t +" years is: "+si);



    }

}
