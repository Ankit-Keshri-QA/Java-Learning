package arrays;

public class JaggedArray {
    public static void main(String[] args) {

        // Approach 1
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 160;
        arr[2][0] = 50;
        arr[2][1] = 104;
        arr[2][2] = 60;
        arr[2][3] = 50;

        System.out.println("Jagged Array Below : ");
        for (int x[] : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // Approach 2
        System.out.println();
        System.out.println("Another Jagged Array Below : ");
        int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

        // Program to Declare , Initialize and print Jagged Array
        System.out.println();

        // Declare and initialize a jagged array
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        /*
        Print this
        1
        1 2
        1 2 3
        1 2 3 4
        */
        System.out.println();
        for (int row = 1; row < 5; row++) {
            for (int col = 1; col < (row + 1); col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }


    }
}
