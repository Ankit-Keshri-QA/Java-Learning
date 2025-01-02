package array_programs;

import java.util.Scanner;

public class Search_element_Enhanced_For {
    public static void main(String[] args) {
        int[] array = {300, 400, 100, 500, 600, 200};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int ele = sc.nextInt();
        boolean flag = false;  // Assuming we will not find the element

        for (int item : array) {
            if (item == ele) {
                System.out.println("Element found ...");
                flag = true;
                break;
            }

        }
        if (!flag)
            System.out.println("Element not found ...");
    }
}
