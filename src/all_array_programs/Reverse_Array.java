package all_array_programs;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] array = {36, 65, 33, 12, 5, 9, 77, 65};

        System.out.println("Array before reversing " + Arrays.toString(array));
        System.out.println("Array after reverse: ");

        // Using For loop
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


    }
}
