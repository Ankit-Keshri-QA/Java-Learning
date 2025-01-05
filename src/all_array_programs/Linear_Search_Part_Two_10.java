package all_array_programs;

import java.util.Scanner;

public class Linear_Search_Part_Two_10 {
    public static void main(String[] args) {
        int[] array = {12, 34, 11, 76, 19, 29, 38, 71, 25, 90};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be searched: ");
        int ele = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == ele) {
                System.out.println("Element found at index " + i + "th position ..");
                flag = true;
                break;
            } else if (i == array.length - 1) {
                System.out.println("Try another element ...");
                ele = sc.nextInt();
                for (int j = array.length - 1; j >= 0; j--) {
                    if (array[j] == ele) {
                        System.out.println("New element found at " + j + "th position ..");
                        flag = true;
                        break;
                    }
                }

            }
        }

        if (!flag)
            System.out.println("Your both attempts failed ..");

    }
}
