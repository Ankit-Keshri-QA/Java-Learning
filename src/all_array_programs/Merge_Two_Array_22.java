package all_array_programs;

import java.util.Arrays;

public class Merge_Two_Array_22 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int newArray[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < newArray.length / 2; i++) {
            newArray[i] = arr1[i];
        }

        int index = newArray.length / 2;
        for (int i = 0; i < newArray.length / 2; i++) {
            newArray[index] = arr2[i];
            index++;
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 1: " + Arrays.toString(arr2));
        System.out.println("New Merged Array: " + Arrays.toString(newArray));

    }
}
