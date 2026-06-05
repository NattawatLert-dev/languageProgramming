public class A20overloaded_method {
    public static void main(String[] args) {
        
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

         double result1 = add(1, 2);
         double result2 = add(1, 2, 3);
         double result3 = add(1, 2, 3, 4);

         System.out.println(result1);
         System.out.println(result2);
         System.out.println(result3);
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
}
