package all_array_programs;

import java.util.Arrays;

public class Move_All_Zeroes_Last_30 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 3, 2, 0, 4, 3, 0, 9,0,0};
        int index = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] == 0) {
                        continue;
                    }
                    else if (array[j] != 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    j--;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
