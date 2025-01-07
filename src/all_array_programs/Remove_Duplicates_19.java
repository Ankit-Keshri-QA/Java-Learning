package all_array_programs;

public class Remove_Duplicates_19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 1, 5, 6, 7, 4, 1};
        int newArraySize = 0;

        // New Array should look like -> {1,2,3,4,5,6,7} , 7 ele , 4 removed

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                 if(array[i]!=array[j]){
                     newArraySize++;
                }

            }
        }

    }
}
