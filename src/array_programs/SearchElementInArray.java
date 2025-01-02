package array_programs;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] array = {300, 400, 100, 500, 600, 200};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int ele = sc.nextInt();
        boolean flag = false;  // Assuming we will not find the element

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ele) {
                System.out.println("Element found at index: " + i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(ele + " not found in the array ...");
        }
    }
}
