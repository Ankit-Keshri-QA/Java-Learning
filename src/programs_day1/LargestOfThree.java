package programs_day1;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();

        System.out.println("Your inputs are : " + num1 + " " + num2 + " " + num3);

        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the largest of all");
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the largest of all");
        else
            System.out.println(num3 + " is the largest of all");
    }
}
