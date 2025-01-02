package arrays;

public class First {

    public static void main(String[] args) {


        // Different Ways of Declaring and Initializing arrays
        int numbers[] = new int[10];

        int[] num = {1, 2, 3, 4, 5};

        int[] numb;
        numb = new int[5];

        int[] numberss = new int[] {1,2,3,5,6};

        String str[] = new String[3];
        str[0] = "Ankit";
        str[1] = "Vaibhav";
        str[2] = "Saurabh";


        // ---------------------------------------------------------------------------------

        // Approach 1 - Declaring Array
        int[] a = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        // Approach 2
        int[] a1 = {100, 200, 300, 400, 500};

        // When we are sure with the size of the array and we know in fiture it will not change, use Ap1
        // When we are not sure the size, go with Ap2
        //Also if we don not allocate values to index in Ap1 , memory will be wasted
        //But in Ap2, memory is dynamically assigned as per value adding, so Ap2 is better in this case

        // All in all , Approach2 is better and feasible, less code

        // ---------------------------------------------------------------------------------

        // Size of the array - (array.length) is the Syntax
        System.out.println("Length of the array is: " + a.length);
        System.out.println("Length of the array is: " + a1.length);
        System.out.println("Length of the array is: " + str.length);
        System.out.println("Length of the array is: " + num.length);
        System.out.println("Length of the array is: " + numbers.length);

        // Read Values from the array
        System.out.println();
        System.out.println("Value of the array index at 3 is: " + a[2]);
        System.out.println("Value of the array index at 4 is: " + a1[3]);
        System.out.println("Value of the array index at 2 is: " + str[1]);

        //  System.out.print("Value of the array index at 11 is: "+a[10]); - ArrayIndexOutOfBoundException
        System.out.println("Value at last index is: " + a[a.length - 1]);
        System.out.println();

        // Access all elements using for loop
        // 3 things needed while running a loop
        // 1. First index of array , 2. Total Size of array i.e last index , Increment the index everytime

        //for loop
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else
                System.out.print(a[i] + " - ");

        }
        System.out.println();

        // Using While Loop
        int j = 0;
        while (j < a.length) {
            System.out.print(a[j] + " ");
            j++;
        }

        int[] emptyArray = {};
        System.out.print("Length of empty array is: " + emptyArray.length);

        System.out.println();
        int[] newArray = new int[3];
        // If values are not assigned, default value is 0
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        // for each loop - Enhanced For Loop
        for (int x : a1)
            System.out.print(x + " ");




    }
}
