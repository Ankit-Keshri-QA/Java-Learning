package all_array_programs;

public class Second_Largest_Ele_18 {
    public static void main(String[] args) {
        int[] array = {2, 24, 36, 81, 65, 181, 2892, 1212, 91, 101, 375, 564, 347};
        int largest = array[0];
        int secondLargest = array[1];

        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second Largest element is: " + secondLargest);


    }
}
