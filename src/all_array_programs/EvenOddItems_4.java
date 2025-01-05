package all_array_programs;

public class EvenOddItems_4 {
    public static void main(String[] args) {
        int[] array = {2, 33, 11, 24, 19, 56, 78, 23, 47, 88, 92, -1};

        System.out.println("Even items of the array are ..");
        for (int x : array) {
            if (x % 2 == 0)
                System.out.println(x);
        }
        System.out.println();
        System.out.println("Odd items of the array are ..");
        for (int x : array) {
            if (x % 2 != 0)
                System.out.println(x);
        }
    }
}
