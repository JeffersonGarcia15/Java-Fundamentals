package exceptions;

public class NegativeInputException extends Exception{

    public NegativeInputException() {
        this("Input must be greater than or equal to 0"); // When you call this() you are calling the constructor
        // so we are calling line 12 and its String message arg is now "Input must be greater than or equal to 0"
        // Specifically, it matches the constructor that matches the argument that I'm sending. Since it is a string
        // it must be calling line 12

//        super("Input must be greater than or equal to 0"); was another possibility.
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
