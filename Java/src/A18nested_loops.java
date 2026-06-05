import java.util.Scanner;

public class A18nested_loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A

        //Ex.1
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " ");
            }   
            System.out.println();
        }

        System.out.println("##########################");

        //Ex.2
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char symbol = scanner.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
