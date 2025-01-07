package all_array_programs;

import java.util.Arrays;

public class Divide_Array_Divisible_By_Three_16 {
    public static void main(String[] args) {
        int[] array = {7, 9, 15, 191, 27, 98, 57, 87, 93, 18, 45, 0, -72};
        int count = 0;

        for (int item : array) {
            if (item % 3 == 0)
                count++;
        }

        int[] newArray = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                newArray[index] = array[i];
                index++;
            }
        }

        System.out.println("Original Array is: "+ Arrays.toString(array));
        System.out.println("New Array having items divided by 3 is: "+ Arrays.toString(newArray));

    }
}
