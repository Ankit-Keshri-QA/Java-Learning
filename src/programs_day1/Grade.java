package programs_day1;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int num = sc.nextInt();

        if (num >= 90)
            System.out.println("Grade A");
        else if (num >= 75)
            System.out.println("Grade B");
        else if (num >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");


    }
}
