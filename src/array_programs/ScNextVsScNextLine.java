package array_programs;

import java.util.Scanner;

public class ScNextVsScNextLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Entered String is : "+str);

        System.out.println("Enter new string again : ");
        String string = sc.next();
        System.out.println("Entered String is : "+string);

    }
}
