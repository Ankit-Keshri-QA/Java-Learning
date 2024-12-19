package programs_day1;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if (num == 0)
            System.out.println("You entered zero ..");
        else if (num % 2 == 0)
            System.out.println(num + " is even ");
        else if (num % 2 != 0)
            System.out.println(num + " is odd");
        else
            System.out.println("Undefined Number ... ");
    }
}
