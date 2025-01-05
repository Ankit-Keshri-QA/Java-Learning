package all_array_programs;

public class Sum_Of_Half_Array_11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;


        if (array.length % 2 != 0) {
            System.out.println("Array has odd number of elements ... ");
            for (int i = 0; i <= (array.length / 2); i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of first half is: " + sum);
            sum = 0;
            for (int i = (array.length / 2); i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of second half is: " + sum);
        }
        else {
            System.out.println("Array has even number of elements ... ");
            for (int i = 0; i < (array.length / 2); i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of first half is: " + sum);
            sum = 0;
            for (int i = (array.length / 2); i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of second half is: " + sum);
        }

    }
}
