package a06inheritance;

public class Test {
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);

        dog.eat();
        dog.speak();
        cat.eat();
        cat.speak();


    }
}
