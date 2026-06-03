package a03overloadedconstructor;

public class Test {
    public static void main(String[] args) {
        
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "Fake123@gmail.com");
        User user3 = new User("Sandy", "SCheek23@gmail.com", 15);

        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println();

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println();

    }
}
