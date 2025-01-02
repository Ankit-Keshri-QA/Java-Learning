package array_programs;

public class Reverse_Array {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 12, 9};

        System.out.println("Original array: ");
        for (int x : array)
            System.out.print(x + " ");

        System.out.println();
        System.out.println("Reverse Array: ");

        // Use classic for loop, Enhanced for loop wont work
        for (int i = array.length - 1; i >= 0; i--) { // Run the for loop in reverse order and print array
            System.out.print(array[i] + " ");
        }

    }
}
