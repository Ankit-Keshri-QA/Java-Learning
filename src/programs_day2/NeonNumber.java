package programs_day2;

public class NeonNumber {

    public static void main(String[] args) {
        int num = 9;
        int square = num * num;
        int sum = 0, num1 = num;
        while (num > 0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }

        System.out.println("Sum is: " + sum);
        if (sum == num1)
            System.out.println(num1 + " is a neon number");
        else
            System.out.println(num1+" is not a neon number");
    }
}
