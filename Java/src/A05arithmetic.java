public class A05arithmetic {
    public static void main(String[] args) {
        
        // Arithmetic Operators

        int x = 3;
        int y = 10;

        System.out.println("#####################");
        System.out.println("Arithmetic Operator : ");
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x % y = " + (x%y));
        System.out.println("#####################\n");

        int a = 10;
        int b = 5;

        System.out.println("#####################");
        System.out.println("Augmented Assignment Operators : ");
        System.out.println("a = a + b : " + (a+=b));
        System.out.println("a = a - b : " + (a-=b));
        System.out.println("a = a * b : " + (a*=b));
        System.out.println("a = a / b : " + (a/=b));
        System.out.println("a = a % b : " + (a%=b));
        System.out.println("#####################\n");

        
        System.out.println("#####################");
        System.out.println("Increment Operator : ");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);
        System.out.println();
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x = " + x);
        System.out.println("#####################");
        System.out.println("Decrement Operator : ");
        System.out.println("x = " + x);
        System.out.println("x-- = " + (x--));
        System.out.println("x = " + x);
        System.out.println();
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x));
        System.out.println("x = " + x);      
        System.out.println("#####################\n");

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("#####################");
        System.out.println("Order of operations [P-E-M-D-A-S] : ");
        System.out.println(result);
        System.out.println("#####################\n");



    }
}
