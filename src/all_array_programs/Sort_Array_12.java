package all_array_programs;

import java.util.Arrays;

public class Sort_Array_12 {
    public static void main(String[] args) {
        int[] array = {7, 4, 98, 54, 23, 58, 71, 29};

        // Arrays method
        System.out.println("Before Sorting array is: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After Sorting array is: " + Arrays.toString(array));

        // Normal for loop
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println("Sorting Ascending order using normal for loop: " + Arrays.toString(array));

        // Descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println("Sorting Descending order using normal for loop: " + Arrays.toString(array));

        // Sort string array
        System.out.println();
        String[] names = {"Naveen", "Anush", "Dinesh", "Barry", "Jhon", "Faf"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println();
        // Sorting using Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                // Compare adjacent elements
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap if out of order
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.print(name + " ");

        }
    }
}
