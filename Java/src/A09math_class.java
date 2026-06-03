public class A09math_class {
    public static void main(String[] args) {
        
        System.out.println("###########################");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println("2 Power 3 = " + Math.pow(2, 3));
        System.out.println("absolute -5 = " + Math.abs(-5));
        System.out.println("square root 9 = " + Math.sqrt(9));
        System.out.println("round 3.14 = " + Math.round(3.14));
        System.out.println("ceiling 3.14 = " + Math.ceil(3.14));
        System.out.println("floor 3.99 = " + Math.floor(3.99));
        System.out.println("max = " + Math.max(10, 20));
        System.out.println("min = " + Math.min(10 , 20));
        System.out.println("###########################\n");

        // HYPOTENUSE c = Math.squrt(a^2 + b^2)

        int a = 3;
        int b = 4;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) = " + c + "cm");
        System.out.println();

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
