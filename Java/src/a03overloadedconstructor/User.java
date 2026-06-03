package a03overloadedconstructor;

public class User {
    
    String name;
    String email;
    int age;

    public User(){
        this.name = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    public User(String name){
        this.name = name;
        this.email = "Not provided";
        this.age = 0;
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
