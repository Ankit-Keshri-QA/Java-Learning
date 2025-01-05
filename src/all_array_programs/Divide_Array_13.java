package all_array_programs;

import java.util.Arrays;

public class Divide_Array_13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int evenCount = 0, oddCount = 0;

        for (int item : array) {
            if (item % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int indexEven = 0, indexOdd = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[indexEven] = array[i];
                indexEven++;
            } else {
                oddArray[indexEven] = array[i];
                indexOdd++;
            }

        }

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Even array: " + Arrays.toString(evenArray));
        System.out.println("Odd array: " + Arrays.toString(oddArray));
    }
}
