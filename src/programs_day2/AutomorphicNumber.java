package programs_day2;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 5;
        int square = num * num;
        int temp = square % 10;
        if (temp == num)
            System.out.println(num + " is Automorphic number ..");
        else
            System.out.println(num + " is not Automorphic Number ..");
    }
}
