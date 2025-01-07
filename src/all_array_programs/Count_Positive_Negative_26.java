package all_array_programs;

public class Count_Positive_Negative_26 {
    public static void main(String[] args) {
        int[] array = {-12, 11, 133, -29, -122, -87, 91, -56, -10, 87, 65};
        int countPositive = 0, countNegative = 0;

        for (int item : array) {
            if (item < 0)
                countNegative++;
            else
                countPositive++;
        }

        System.out.println("Total Positive elements in the array are: " + countPositive);
        System.out.println("Total Negative elements in the array are: " + countNegative);
    }
}
