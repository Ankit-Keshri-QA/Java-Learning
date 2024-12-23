package arrays;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        // Assigning values in array using loops
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Print the values
        System.out.println("The array values after your inouts is: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
