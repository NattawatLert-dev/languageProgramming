import java.util.Scanner;

public class A15while_loops {
    public static void main(String[] args) {
        
        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        //EX.1
        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        
        //EX.2
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the games");

        //EX.3
        int age;

        do { 
            System.out.println("Your age cant't be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");
    
    }
}
