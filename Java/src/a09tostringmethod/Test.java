package a09tostringmethod;

public class Test {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car);
    }
}
