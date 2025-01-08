package all_array_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_28 {
    public static void main(String[] args) {
        int[] array1 = {4, 1, 5, 2, 7, 3, 9, 10};
        int[] array2 = {6, 5, 11, 8, 1, 13};

        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] merged_Array = Arrays.copyOf(array1, array1.length + array2.length);

        int index = array1.length;
        int index2 = 0;
        for (int i = array1.length; i < merged_Array.length; i++) {
            merged_Array[index] = array2[index2];
            index++;
            index2++;
        }

        Arrays.sort(merged_Array);
        System.out.println("array1: "+Arrays.toString(array1));
        System.out.println("array2: "+Arrays.toString(array2));
        System.out.println("Merged Array: "+ Arrays.toString(merged_Array));

    }
}
