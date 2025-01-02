package programs_day2;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition is : "+(num+num2));

        System.out.println();

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Are you married: ");
        boolean isMarried = sc.nextBoolean();
        System.out.println("Enter tour gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("your gender is: "+gender);






    }
}
