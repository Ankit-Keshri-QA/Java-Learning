package all_array_programs;

import java.util.Arrays;

public class Ele_Occur_More_Than_Once_27 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 1, 3, 2, 4, 5};

        int[] visited = new int[array.length];

        System.out.println("Elements that occurred more than once are: ");
        for (int i = 0; i < array.length; i++) {
            if (visited[i] == 1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = 1;
                }
            }

            if (count > 1)
                System.out.print(array[i] + " ");

        }
    }
}
