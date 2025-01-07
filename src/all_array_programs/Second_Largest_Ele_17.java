package all_array_programs;

import java.util.Arrays;

public class Second_Largest_Ele_17 {
    public static void main(String[] args) {
        int[] array = {2, 24, 12, 81, 65, 181, 2892, 1212, 91, 101, 375, 564, 347};

        System.out.println("Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Second Largest Element is: " + array[array.length - 2]);


    }
}
