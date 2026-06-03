import java.util.Random;
import java.util.Scanner;

public class A37rock_paper_scissors {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        do { 
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
            }

            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }else if (playerChoice.equals("rock") && computerChoice.equals("csissors") || 
                      playerChoice.equals("paper") && computerChoice.equals("rock") || 
                      playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }else{
                System.out.println("You lose!");
            }

            System.out.println("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
            System.out.println(playAgain); // yes / no

        } while (playAgain.equals("yes"));
    }
}
