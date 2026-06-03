import java.util.Scanner;

public class A15weight_converter{
    public static void main(String[] args) {
        
        // Weight converter program

        int option;
        double weight;
        double newWeight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        
        System.out.print("Choose an option: ");
        option = scanner.nextInt();
        
        switch (option) {
            case 1 -> {
                System.out.print("Enter the weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is: %.2f", newWeight);
            }
            case 2 -> {
                System.out.print("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is: %.2f", newWeight);
            }
            default -> System.out.println("That was not valid choice");
        }

    }
}