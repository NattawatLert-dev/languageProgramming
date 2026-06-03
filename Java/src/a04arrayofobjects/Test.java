package a04arrayofobjects;

public class Test {
    
    public static void main(String[] args) {
        
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        /* 
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
        */

        for(Car item : cars){
            item.drive();
        }
    }
}
