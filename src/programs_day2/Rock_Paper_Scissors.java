package programs_day2;

import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String[] values = {"Rock", "Paper", "Scissor"};


        Scanner sc = new Scanner(System.in);
        while (true) {
            String computerChoice = values[(int) Math.floor(Math.random() * 3)];
            System.out.println("Enter your choice ...");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");

            String choice = sc.next();

            if (choice.equalsIgnoreCase(computerChoice)) System.out.println("Draw");

            else if ((choice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissor")) || choice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("scissor") && computerChoice.equalsIgnoreCase("paper")) {
                System.out.println("Computer chose " + computerChoice);
                System.out.println("You win ..");
            } else {
                System.out.println("Computer chose " + computerChoice);
                System.out.println("Computer wins ..");

            }


        }
    }
}
