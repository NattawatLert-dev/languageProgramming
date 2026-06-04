package a10abstraction;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius;
    }

    public void displayArea(){
        System.out.printf("%.2f\n", area());
    }
    
}
