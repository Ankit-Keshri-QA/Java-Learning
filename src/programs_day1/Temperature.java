package programs_day1;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the farenheit : ");
        double far = sc.nextDouble();
        double celcius = (far - 32) * (5.0 / 9.0);

        System.out.println("The celcius is : " + celcius);

        System.out.println("Now Enter the celcius : ");
        double cel = sc.nextDouble();

        double farenheit = cel * (9 / 5) + 32;
        System.out.println("The farenheit is : " + farenheit);

        sc.close();


    }

}
