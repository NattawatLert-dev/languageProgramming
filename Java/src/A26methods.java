public class A26methods {
    public static void main(String[] args) {
        
        // method = a block of reusable code that is executed when called ()

        String name = "Nattawat";
        int age = 21;

        happyBirthday1(); //Ex.1
        happyBirthday2(name, age); //Ex.2
        
        double result = square(3); //Ex.3
        System.out.println(result); 

    }
    static void happyBirthday1(){ //Ex.1
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
    }
    static void happyBirthday2(String name, int age){ //Ex.2
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.println("You are "  + age + " years old!");
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){ //Ex.3
        return number * number;
    }
}
