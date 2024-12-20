package programs_day2;

public class DisariumNumnber {

    public static void main(String[] args) {
        int num = 135;
        int sum = 0, num1 = num;
        int length = String.valueOf(num).length();

        while (num > 0) {
            int temp = num % 10;
            sum = sum + (int) Math.pow(temp, length);
            num = num / 10;
            length--;

        }
        if (sum == num1)
            System.out.println(num1 + " is Disarium Number ..");
        else
            System.out.println(num1 + " is not a Disarium number ...");
    }
}
