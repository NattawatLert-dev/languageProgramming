import java.util.Random;

public class A08random_number {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number;
        double number1;
        boolean isHeads;

        number = random.nextInt(1, 6);
        number1 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number1);
        if(isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }
    }
}
