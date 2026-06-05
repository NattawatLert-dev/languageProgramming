import java.util.Scanner;

enum Day {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}

public class A35enums {
    public static void main(String[] args) {
        
        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(response);

        System.out.println(day);
        System.out.println(day.getDayNumber());

        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURDAY,
                 FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
        }
    }    
}
