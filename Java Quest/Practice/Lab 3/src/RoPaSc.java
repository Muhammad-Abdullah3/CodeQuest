import java.util.Scanner;
import java.util.Random;

public class RoPaSc {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int usChoice= 0;
        int score = 0,turns = 0;
        System.out.println("Win Five games against computer to clear this level.");
        do{
        	System.out.println("\t\tRock Paper Scissors Game Menu!!!!!!");
            System.out.println("Enter \"1\" for Rock...");
            System.out.println("Enter \"2\" for Scissors... ");
            System.out.println("Enter \"3\" for Paper... ");
            System.out.print("Enter your choice: ");
            usChoice = inp.nextInt();
            Random random = new Random();
            int compChoice = random.nextInt(3) + 1;

            if (compChoice == 1) {
                System.out.println("Computer chooses: Rock");
            } else if (compChoice == 2) {
                System.out.println("Computer chooses: Scissors");
            } else {
                System.out.println("Computer chooses: Paper");
            }

            if (usChoice == compChoice) 
            {
                System.out.println("It's a tie.");
            } else if ((usChoice == 1 && compChoice == 3) ||(usChoice== 2 && compChoice == 1) || (usChoice == 3 && compChoice == 2)) 
            {
                System.out.println("Computer won the Game");
                score--;
            } else 
            {
                System.out.println("You won the Game");
                score++;
            }
            turns++;
            } while(score<5);
        System.out.println("You cleared the level in "+turns+" turns.");
        inp.close();
        }
}
