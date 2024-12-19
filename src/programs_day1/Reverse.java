package programs_day1;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rev = 0;

        System.out.println("Number is: " + num);
        while (num > 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }

        System.out.println("The reversed number is: " + rev);


    }

}
