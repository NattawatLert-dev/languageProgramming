package a06inheritance;

public class Animal extends Organism{
    
    boolean isAlive;

    public Animal() {
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating");
    }
}
