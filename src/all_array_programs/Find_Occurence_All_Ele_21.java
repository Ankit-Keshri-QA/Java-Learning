package all_array_programs;

public class Find_Occurence_All_Ele_21 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 2, 1};

        int[] visited = new int[array.length];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = 0;
        }

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

            // Print the element and its count
            System.out.println(array[i] + " -> " + count);
        }

    }
}
