package array_programs;

public class Print_Even_Odd_Places {

    public static void main(String[] args) {
        int[] array = {15, 21, 36, 49, 35, 76, 47, 38, 91, 10};
        System.out.println("Items at even places are: ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Items at odd places are: ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
                System.out.print(array[i] + " ");
        }

    }
}
