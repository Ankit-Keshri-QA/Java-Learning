package all_array_programs;

import java.util.Arrays;

public class Divisble_Three_Five_8 {
    public static void main(String[] args) {
        int[] array = {17, 12, 45, 28, 76, 75, 18, 90, 25, 105, 125};

        System.out.println("Array elements are: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Values divisible by both 3 and 5 are: ");

        for (int x : array) {
            if (x % 3 == 0 && x % 5 == 0)
                System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Values divisible by 3 or 5 are: ");

        for (int x : array) {
            if (x % 3 == 0 && x % 5 != 0)
                System.out.println(x + " divisible by 3");
            else if (x % 5 ==0 && x % 3 != 0)
                System.out.println(x + " divisible by 5");

        }

    }
}
