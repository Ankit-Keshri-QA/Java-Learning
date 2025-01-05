package all_array_programs;

public class SmallestElement_6 {
    public static void main(String[] args) {
        int[] array = {12, 32, 45, 11, 456, 56, 73, 31, 6, 34, 9};
        int min = array[0]; // We assume the first element is minimum
        int index = 2;

        // Now we run a loop to compare all elements with first

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Substitute the value of max with this element
                index = i; // We capture the index position of this element
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("And it was found at index: " + index);
    }
}
