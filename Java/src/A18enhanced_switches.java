public class A18enhanced_switches {
    public static void main(String[] args) {
        
        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        String day = "Monday";

        switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
        }
    }
}
