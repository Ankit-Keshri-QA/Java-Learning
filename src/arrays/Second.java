package arrays;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        // Assigning values in array using loops
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Assign
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        System.out.println("The array is: ");
        // Print
        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}
