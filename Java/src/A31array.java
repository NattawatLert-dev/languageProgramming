import java.util.Arrays;

public class A31array {
    public static void main(String[] args) {
        
        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        int[] num = {1, 2, 3, 4};

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;
    
        System.out.println(fruits[1]); // apple
        System.out.println(numOfFruits); // 4
        Arrays.sort(fruits); // apple banana coconut orange
        Arrays.fill(fruits, "pineapple"); // pineapple pineapple pineapple pineapple
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for(String item : fruits){
            System.out.println(item);
        }

    }
}
