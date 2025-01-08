package all_array_programs;

public class First_And_Last_Occurrence_32 {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 4, 6, 4, 7, 8};
        int target = 4;
        int first = -1;
        int last = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        if (first != -1) {
            System.out.println("The first occurrence of " + target + " is: " + first);
            System.out.println("The last occurrence of " + target + " is: " + last);
        } else
            System.out.println(target + " is not found in the array ..");

    }
}
