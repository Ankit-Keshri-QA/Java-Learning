package all_array_programs;

public class Print_Half_Array_2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("First half of the array ...");
        for (int i = 0; i < (array.length) / 2; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        System.out.println("Second Half of the array ...");
        for(int j=array.length-1;j>=(array.length)/2;j--){
            System.out.println(array[j]);
        }

    }
}
