import java.util.Scanner;

public class A29exception_handling {
    public static void main(String[] args) {
        
        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);


        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(Exception e){
            // SAFETY NET
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This always executes");
        }
    }
}
