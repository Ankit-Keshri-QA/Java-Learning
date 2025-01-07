package all_array_programs;

import java.util.Arrays;

public class Divide_Array_Half_15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int size = array.length;

        System.out.println("Original Array is: "+Arrays.toString(array));

        int[] array1 = new int[size / 2];
        int[] array2 = new int[size / 2];

        for (int i = 0; i < size / 2; i++) {
            array1[i] = array[i];
        }

        int index = size/2;

        for (int i = 0; i < size/2; i++) {
            array2[i] = array[index];
            index++;
        }

        System.out.println();
        System.out.println("First Half of the array is: "+ Arrays.toString(array1));
        System.out.println("Second Half of the array is: "+ Arrays.toString(array2));

    }
}
