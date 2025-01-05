package all_array_programs;

import java.util.Arrays;

public class Sum_And_Average_7 {
    public static void main(String[] args) {
        int[] array = {34, 65, 76, 21, 97, 55, 123, 67, 38, 2, 7, 98};
        double sum = 0 ;

        System.out.println("Array elements are: " + Arrays.toString(array));
        System.out.println();

        for (int x : array) {
            sum = sum + x;
        }

        double avg = sum / array.length;

        System.out.println("Sum of all the elements are: " + (int)sum);
        System.out.println("Average is: " + avg);

    }
}
