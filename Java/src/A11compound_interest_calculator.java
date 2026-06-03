import java.util.Scanner;

public class A11compound_interest_calculator {
    public static void main(String[] args) {
        
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        double timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();
        System.out.println("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextDouble();
        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + rate / timesCompounded) , timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);


    }
}
