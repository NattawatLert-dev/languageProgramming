public class A02variables {
    public static void main(String[] args) {
       
        // ❎ Variables = A reusable container for a value
        //              a variable behaves as if it was the value it contains

        // 🟥 Primitive = Simple value stored directly in memory (stack)
        // 🟦 Reference = Memory address (stack) that points to the (heap)

        // 🟥 Primitive Vs 🟦 Reference
        //    ----------       ----------
        //    int              String
        //    double           array
        //    char             object
        //    boolean

        // 2.Step to creating a variable
        // -----------------------------
        // 1. declaration
        // 2. assignment

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println("##########################");
        System.out.println("Example int: ");
        System.out.println("You are " + age + " years old");
        System.out.println("This year is " + year);
        System.out.println(quantity);
        System.out.println("##########################\n");

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("##########################");
        System.out.println("Example double: ");
        System.out.println("$" + price);
        System.out.println("Your gpa is: " + gpa);
        System.out.println(temperature);
        System.out.println("##########################\n");

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("##########################");
        System.out.println("Example char: ");
        System.out.println("Your average letter grade is: " + grade);
        System.out.println(symbol);
        System.out.println(currency);
        System.out.println("##########################\n");

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("##########################");
        System.out.println("Example boolean: ");
        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
        System.out.println("##########################\n");

        String name = "Nattawat Comsci";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("##########################");
        System.out.println("Example String: ");
        System.out.println("Hello " + name);
        System.out.println(food);
        System.out.println(email);
        System.out.println(car);
        System.out.println(color);
        System.out.println("##########################\n");

        System.out.println("##########################");
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("##########################");

    }
}
/*
Primirive type   size      Wrapper type

boolean          -         Boolean 
char            16 bits    Character
byte            8 bits     Byte
short           16 bits    Short
int             32 bits    Integer
long            64 bits    Long
float           32 bits    Float
double          64 bits    Double
void              -        Void

*/