package all_array_programs;

import java.util.Scanner;

public class Find_Occurence_Single_Ele_20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 1, 5, 1, 2, 4, 1};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element: ");
        int ele = sc.nextInt();

        int count = 0;

        for (int item : array) {
            if (item == ele)
                count++;
        }

        System.out.println("Occurence of " + ele + " is: " + count);

    }
}
