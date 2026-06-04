package a07super;

public class Test {
    public static void Main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Tom", "Riddle", 3.5);
        Employee employee = new Employee("Ruberus", "Hagrid", 50000);

        person.showName();
        student.showGPA();
        employee.showSalary();

    }
}
