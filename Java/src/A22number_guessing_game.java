import java.util.Random;
import java.util.Scanner;

public class A22number_guessing_game {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(1,101);
        int guess;
        int attempts = 0;

        System.out.println("umber Guessing Game");
        System.out.println("Guess a number between 1-10: ");

        do { 
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < rand){
                System.out.println("TOO LOW! Try again");
            }else if(guess > rand){
                System.out.println("TOO HIGH! Try again");
            }else{
                System.out.println("CORRECT! The number was " + rand);
                System.out.println("# of attempts: " + attempts);
            }
        } while (guess != rand);
    }
}
