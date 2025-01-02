package array_programs;

import java.util.Scanner;

public class Find_Duplicates {
    public static void main(String[] args) {
        int[] array = {300, 400, 100, 300, 200, 500, 600, 200, 400};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be counted: ");
        int ele = sc.nextInt();

        int count = 0;

        for (int x : array) {
            if (x == ele)
                count++;
        }

        if (count == 0)
            System.out.println("Element not present in the array ..");
        else
            System.out.println(ele + " found " + count + " times in the array ..");
    }
}
