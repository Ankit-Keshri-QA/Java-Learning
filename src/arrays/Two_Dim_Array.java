package arrays;

public class Two_Dim_Array {

    public static void main(String[] args) {


        //Approach 1
        int[][] array2D = new int[3][2];
        array2D[0][0] = 100;
        array2D[0][1] = 200;
        array2D[1][0] = 300;
        array2D[1][1] = 400;
        array2D[2][0] = 500;
        array2D[2][1] = 600;

        //Approach 2
        int[][] array2D_2 = {{100, 200}, {300, 400}, {500, 600}};


        //Size of array
        System.out.println("Number of rows/Size of array: " + array2D.length);
        System.out.println("Number of columns at row 1: " + array2D[1].length);

        // Retrieve single  value of array

        System.out.println("Value: " + array2D[1][1]);
        System.out.println("Value: " + array2D[2][1]);
        System.out.println("Value: " + array2D[0][0]);
        System.out.println("Value: " + array2D[2][0]);
        System.out.println();

        // Print the array

        System.out.print("2D array Printing:- ");
        System.out.println();
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Enhanced for loop for Printing 2D Array
        for (int row[] : array2D_2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();
        /*
        Print this
        *
        **
        ***
        ****
        *****
         */

        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");

            }
            System.out.println();
        }


        // Storing heterogeneous type of data in array
        // Object is a predefined class in class , Root class in Java , superclass
        // Object is the parent of all classes, root
        // Object is a non-primitive type

        Object[] arrayH = {"Ankit", 11, true, 'A', 1128.12f,};
        System.out.println();

        for(Object x:arrayH){
            System.out.print(x+"-");
        }


    }
}
