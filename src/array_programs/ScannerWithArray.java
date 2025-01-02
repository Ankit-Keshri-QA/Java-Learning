package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWithArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i);
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Array using Arrays class is :" + Arrays.toString(array));

    }
}
