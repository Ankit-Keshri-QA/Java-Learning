package programs_day2;

public class Harshad_Niven_Number {

    public static void main(String[] args) {
        int num = 18;
        int sum = 0, num1 = num;

        while (num > 0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        if (num1 % sum == 0) {
            System.out.println(num1 + " is a Harshad number ...");
        }
        else
            System.out.println("Nope");

    }
}
