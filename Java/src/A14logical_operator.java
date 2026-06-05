import java.util.Scanner;

public class A14logical_operator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        }else if (temp > 30 || temp < 0) {
            System.out.println("The weather is BAD");
        }

        System.out.println("Enter your new username: ");
        String name = scanner.nextLine();

        if(name.length() < 4 || name.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }else if(name.contains(" ") || name.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }else{
            System.out.println("Welcome " + name);
        }
    }
}
