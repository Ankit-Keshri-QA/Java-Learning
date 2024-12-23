package array_programs;

import java.util.Scanner;

public class Print_Array {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ankit";
        names[1] = "Vaibhav";
        names[2] = "Saurabh";

        for (int name = 0; name < names.length; name++) {
            System.out.print(names[name] + " ");
        }
        System.out.println();

        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Items of defined array are: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        int[] arr = {100, 200, 300, 400, 500, 600};
        System.out.print("New Array:- ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Print only half array
        for (int i = 0; i < (arr.length) / 2; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
