package all_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class First_And_Last_Occurrence_31 {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5, 3, 1, 6, 7};

        System.out.println("Original Array is: " + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find: ");

        int num = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("The first occurrence of " + num + " is: " + i);
                break;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == num) {
                System.out.println("The last occurrence of " + num + " is: " + i);
                break;
            }
        }

    }
}
