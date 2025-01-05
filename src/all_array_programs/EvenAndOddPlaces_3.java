package all_array_programs;

public class EvenAndOddPlaces_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Items at even places are : ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Items at odd places are : ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
                System.out.print(array[i] + " ");
        }
    }
}
