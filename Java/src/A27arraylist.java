import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A27arraylist {
    public static void main(String[] args) {
        
        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        //list.remove(0);
        list.set(0, 2000);
        
        System.out.println(list.get(0));
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        //input for arraylist

        ArrayList<String> foods = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
    }
}
