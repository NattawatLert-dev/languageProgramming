public class A25varargs {
    public static void main(String[] args) {
        
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 4));

        System.out.println(average(1, 2, 3));

    }
    static int add(int... numbers){
        
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }

    static double average(double... x){

        double sum = 0;

        if(x.length == 0){
            return 0;
        }

        for(double num : x){
            sum += num;
        }

        return sum / x.length;
    }
}
