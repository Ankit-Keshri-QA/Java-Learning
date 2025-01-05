package all_array_programs;

public class LargestElement_5 {
    public static void main(String[] args) {
        int[] array = {12, 32, 45, 11, 4, 56, 73, 31, 62, 34, 9};
        int max = array[0]; // We assume the first element is max
        int index=2;

        // Now we run a loop to compare all elements with first

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Substitute the value of max with this element
                index = i; // We capture the index position of this element
            }
        }

        System.out.println("The maximum value in the array is: " + max);
        System.out.println("And it was found at index: " + index);

    }
}
