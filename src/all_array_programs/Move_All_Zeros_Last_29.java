package all_array_programs;

import java.util.Arrays;

public class Move_All_Zeros_Last_29 {
    public static void main(String[] args) {
        int[] array = {1, 3, 0, 2, 0, 0, 4, 5, 0, 2, 0};

        int zero = 0, notZero = 0;

        for (int item : array) {
            if (item == 0)
                zero++;
            else
                notZero++;
        }

        int[] array1 = new int[notZero];
        int[] array2 = new int[zero];

        int index = 0, index1 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array2[index1] = array[i];
                index1++;
            } else {
                array1[index] = array[i];
                index++;
            }
        }

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));


        int[] merged_array = Arrays.copyOf(array1, array1.length + array2.length);


        int index3 = array1.length;
        int index2 = 0;
        for (int i = array1.length; i < merged_array.length; i++) {
            merged_array[index3] = array2[index2];
            index3++;
            index2++;
        }

        System.out.println("All Zeros At Last: " + Arrays.toString(merged_array));

    }
}
