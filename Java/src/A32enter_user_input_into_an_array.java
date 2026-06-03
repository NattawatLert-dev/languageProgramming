import java.util.Scanner;

public class A32enter_user_input_into_an_array {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a foood: ");
            foods[i] = scanner.nextLine();
        }

        for(String item : foods){
            System.out.println(item);
        }


    }
}
