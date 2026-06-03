package a05static;

public class Test {
    public static void main(String[] args) {
        
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");

        System.out.println(Friend.numOfFriend);
        Friend.showFriends();

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        
    }
}
