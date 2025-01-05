package all_array_programs;

public class Compare_Two_Arrays_14 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4,58};
        int key = 0;
        
        if (array1.length == array2.length) {
            for (int item : array1) {
                for (int item1 : array2) {
                    if (item == item1) {
                        key++;
                    }
                }
            }
            if (key == array1.length)
                System.out.println("Both arrays are equal ...");
            else
                System.out.println("Both Arrays have same length but not equal ...");

        } else
            System.out.println("Both Arrays are not equal ...");


    }
}
