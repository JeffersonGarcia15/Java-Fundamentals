package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        // constructors in superclasses(parent classes) execute before constructors of the subclass.
        // This makes sense because Java wants to make sure that before you inherit something that things are properly constructed.
//        Person person = new Person();
        Employee employee = new Employee(); // In Person default constructor. printed first because of what I mentioned above.

    }
}
