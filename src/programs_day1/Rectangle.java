package programs_day1;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        double area, perimeter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int width = sc.nextInt();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area of a rectangle is : " + area);
        System.out.println("Perimeter of a rectangle is : " + perimeter);


    }
}
