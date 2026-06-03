public class A28variable_scope {

    static int x = 3; //CLASS

    public static void main(String[] args) {
        
        // variable scope = where a variable can be accessed

        int y = 1; //LOCAL

        System.out.println(y);
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){

        int a = 2; //LOCAL

        System.out.println(a);
    }
}
