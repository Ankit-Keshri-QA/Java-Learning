package all_array_programs;

public class Missing_Number_PartOne_33 {

	public static void main(String[] args) {

		int[] array = { 2, 4, 3, 5, 7, 1, 8, 9 }; /// O/p:- 6
		int missingNum = 1;

		// Find the missing number in the consecutive numbers from 1 to 9

		// Sort the array

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// Compare the each number, if the difference between i and i+1 is 2 then
		// missing num is found

		System.out.println("Array after sorting is: ");
		for (int item : array) {
			System.out.print(item + " ");
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] == 2) {
				missingNum = array[i] + 1;
			}
		}

		System.out.println("Missing number is: "+missingNum);
	}

}
