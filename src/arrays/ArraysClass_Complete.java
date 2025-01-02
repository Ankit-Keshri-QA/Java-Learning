package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysClass_Complete {
    public static void main(String[] args) {
        /*
        Key Features of Arrays Class
        Utility methods for performing operations on arrays.
        Works with both primitive and object arrays.
        Reduces boilerplate code for array operations.
        Provides static methods (can be used without creating an instance).

         */

        // Methods

        // 1. Arrays.toString()

        int[] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(arr)); // Output: [10, 20, 30, 40]

        // 2. Sort Array in ascending order

        int[] arr1 = {40, 10, 30, 20};
        System.out.println("Before Sorting, array is: " + Arrays.toString(arr1));
        Arrays.sort(arr);
        System.out.println("After Sorting, array is: " + Arrays.toString(arr)); // Output: [10, 20, 30, 40]

        // 3. Arrays.binarySearch(arr, value)
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index); // Output: Index of 30: 2

        // 4. Arrays.equals(arr1, arr2)
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {10, 20, 30};
        System.out.println(Arrays.equals(arr2, arr3)); // Output: true

        // 5. Arrays.copyOf(arr1, index)
        int[] arr4 = {10, 20, 30, 40, 50};
        int[] newArr = Arrays.copyOf(arr4, 3);
        System.out.println("New array , copyOf() method: " + Arrays.toString(newArr)); // Output: [10, 20, 30]

        // 6. Arrays.fill(arr,value)
        int[] numbers = new int[5];
        Arrays.fill(numbers, 69);
        System.out.println("Filled Array: " + Arrays.toString(numbers));

        //7. Arrays.asList(arr)
        String[] names = {"Ankit", "Saurabh", "Vaibhav"};
        List<String> arrayToList = Arrays.asList(names);
        System.out.println("The List from array is: " + arrayToList);

    }
}
