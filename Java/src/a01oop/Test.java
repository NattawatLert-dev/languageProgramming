package a01oop;

public class Test {
    public static void main(String[] args) {
        
        // Object = An entity that holds data (attributes)
        //          and can perform actions (method)
        //          Is is a reference data type

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        System.out.println();

        car.drive();
        car.brake();
    }
}
