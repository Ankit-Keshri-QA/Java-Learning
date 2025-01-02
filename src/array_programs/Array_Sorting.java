package array_programs;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] array = {10, 23, 14, 67, 45, 23, 81, 34, 11, 40};
        System.out.println("Before Sorting array is: ");

        for (int x : array)
            System.out.print(x + " ");

        Arrays.sort(array);
        System.out.println();
        System.out.println("After Sorting array is: ");
        System.out.println(Arrays.toString(array));

        char[] ch = {'D', 'B', 'C', 'A', 'G'};
        System.out.println("Before Sorting array is: ");
        System.out.println(Arrays.toString(ch));
        Arrays.sort(ch);
        System.out.println();
        System.out.println("After Sorting array is: ");
        System.out.println(Arrays.toString(ch));

        String[] strArray = {"scott", "david", "marry", "newton"};
        System.out.println("Before Sorting array is: ");
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println();
        System.out.println("After Sorting array is: ");
        System.out.println(Arrays.toString(strArray));

    }
}
