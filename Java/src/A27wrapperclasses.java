public class A27wrapperclasses {
    public static void main(String[] args) {
        
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Unboxing
        int x = a;
        System.out.println(x);

        //EX.1
        String a1 = Integer.toString(123);
        String b1 = Double.toString(3.14);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(false);

        String x1 = a1 + b1 + c1 + d1;

        System.out.println(x1);

        //EX.2
        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("3.14");
        char c2 = "Pizza".charAt(0);
        boolean d2 = Boolean.parseBoolean("true");

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
