package programs_day1;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int num1 = num;
        int armNumber = 0;

        while (num > 0) {
            int temp = num % 10;
            armNumber = armNumber + (int) Math.pow(temp, 3);
            num = num / 10;
        }

        if (armNumber == num1)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}
