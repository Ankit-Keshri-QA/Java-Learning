package programs_day1;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean flag = false;

        if (num % 2 == 0) {
            flag = true;
            System.out.println(num + " is an even number...");
        } else
            System.out.println(num + " is odd ..");

        System.out.println(flag);

    }
}
