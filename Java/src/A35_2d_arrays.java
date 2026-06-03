public class A35_2d_arrays {
    public static void main(String[] args) {
        
        // 2D array = an array where each element is an array
        //            Useful for storing a matrix of data

        //Ex.1
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        //Ex.2
        char[][] telephone = { {'1', '2', '3'},
                               {'4', '5', '6'},
                               {'6', '7', '9'},
                               {'*', '0', '#'}};

        for(char[] items : telephone){
            for(char newitem : items){
                System.out.print(newitem  + " ");
            }
            System.out.println();
        }

    }
}
