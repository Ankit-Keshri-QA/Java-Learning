package all_array_programs;

import java.util.Arrays;

public class Find_Diff_Max_Min_23 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 6, 3, 8, 5, 9, 10, 1, 4, 14, 18, 11};

        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("Max ele is: " + array[array.length - 1]);
        System.out.println("Min ele is: " + array[0]);

        System.out.println("Difference is: " + (array[array.length - 1] - array[0]));
    }
}
