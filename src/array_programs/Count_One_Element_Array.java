package array_programs;

import java.util.Scanner;

public class Count_One_Element_Array {
    public static void main(String[] args) {
        int[] array = {300, 400, 100, 300, 200, 500, 600, 200, 400};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be counted: ");
        int ele = sc.nextInt();

        boolean flag = false;  // Assuming we will not find the element
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ele) {
                System.out.println("Element found at index: " + i);
                count++;
                flag = true;
            }
        }

        if (!flag)
            System.out.println("Element not present in the array ..");
        else
            System.out.println(ele + " found " + count + " times in the array ..");
    }

}
