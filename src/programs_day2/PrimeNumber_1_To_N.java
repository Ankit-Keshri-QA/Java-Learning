package programs_day2;

import java.util.Scanner;

public class PrimeNumber_1_To_N {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range of number: ");
        int num = scanner.nextInt();
        System.out.print(1 + " " + 2 + " ");

        for (int i = 4; i <= num; i++) {
            int j = 2;
            for (; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }

            }


        }


    }
}
