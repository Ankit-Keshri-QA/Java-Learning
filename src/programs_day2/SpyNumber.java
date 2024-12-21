package programs_day2;

public class SpyNumber {

    public static void main(String[] args) {
        int num = 112;
        int sum = 0, product = 1, num1 = num;

        while (num != 0) {
            int temp = num % 10;
            sum = sum + temp;
            product = product * temp;
            num = num / 10;
        }

        if(sum==product)
            System.out.println(num1+" is a spy number ..");
        else
            System.out.println(num1+" is not a spy number ..");

    }
}
