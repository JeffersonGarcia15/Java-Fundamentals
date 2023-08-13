package inheritance;

public class Employee extends Person {
    private String employeeId;
    private int salary;
    private String title;

    public Employee() {
        // If you don't call super() then it will implicitly call the implicit constructor of the parent constructor.
        // it MUST be the very first line of the subclass constructor b/c the parent's state has to be set up first.
        // if there is NOT a default constructor, the implicit constructor goes away and so super() won't work unless you pass the args.
        //  so we have to EXPLICITLY make a call to a constructor since no super() implicitly calls default constructor.
        // no default constructor means you need to specify the constructor in the child class.
        super("Jefferson"); // will call the constructor that matches the parameter list.
        System.out.println("In Employee default constructor.");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
