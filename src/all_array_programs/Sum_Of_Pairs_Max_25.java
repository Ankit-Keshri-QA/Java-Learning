package all_array_programs;

public class Sum_Of_Pairs_Max_25 {

    public static void main(String[] args) {
        int[] array = {23, 12, 15, 17, 27, 11, 45, 17};
        int max_sum = array[0] + array[1];
        int num1 = 0, num2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];

                if (sum > max_sum) {
                    max_sum = sum;
                    num1 = i;
                    num2 = j;
                }

            }
        }

        System.out.println("Max sum is " + max_sum + " and it was found at indexes: " + num1 + " and " + num2);
        System.out.println("Values: " + array[num1] + " " + array[num2]);
    }

}
