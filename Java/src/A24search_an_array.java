public class A24search_an_array {
    public static void main(String[] args) {

        //Ex.1
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 3;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

        //Ex.2
        String[] fruits = {"apple", "orange", "banana"};
        String target1 = "orange";
        boolean isFound1 = false;

        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(target1)){
                System.out.println("Element found at index: " + i);
                isFound1 = true;
                break;
            }
        }

        if(!isFound1){
            System.out.println("Element not found in the array");
        }
    }
}
