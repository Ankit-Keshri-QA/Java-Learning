package programs_day1;

import java.util.Scanner;

public class PositiveNegativeUsingFLag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        boolean flag = true; // WE are assuming number is +ve

        if (num == 0)
            System.out.println("Zero");

        else if (num < 0)
            flag = false;

        if (flag)
            System.out.println("+ve");
        else
            System.out.println("-ve");


    }
}
