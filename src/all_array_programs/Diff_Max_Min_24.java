package all_array_programs;

import java.util.Arrays;

public class Diff_Max_Min_24 {
    public static void main(String[] args) {
        int[] array = {4, 1, 5, 2, 7, 3, 8, 11, 7, 14};
        int max = array[0];
        int min = array[1];

        for (int item : array) {
            if (item > max) {
                max = item;
            } else if (item < min)
                min = item;
        }

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Max ele is: " + max);
        System.out.println("Min ele is: " + min);
        System.out.println("Difference is: " + (max - min));
    }
}
