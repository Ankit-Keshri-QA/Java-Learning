package all_array_programs;

public class Linear_Search_Part_One_9 {
    public static void main(String[] args) {
        int[] array = {12, 34, 11, 76, 19, 29, 38, 71, 25, 90};
        int ele = 71;
        boolean flag = false;

        for (int item : array) {
            if (item == ele) {
                System.out.println("Element found ..");
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Element not found in the array ...");

    }
}
