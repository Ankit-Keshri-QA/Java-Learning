package programs_day2;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for which multiplication table will be printed: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }

    }
}
