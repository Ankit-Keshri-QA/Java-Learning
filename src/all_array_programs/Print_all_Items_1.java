package all_array_programs;

public class Print_all_Items_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 5};

        System.out.println("Normal for loop .. ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Enhanced For Loop ...");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        String[] names = {"Ankit", "Vaibhav", "Saurabh", "Ishan", "Harsh", "Abhishek"};

        for (Object str : names) {
            System.out.println(str);
            System.out.println(str);
        }


    }
}
