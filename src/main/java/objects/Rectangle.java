package objects;

public class Rectangle {
    // ENCAPSULATION
    // All data and behavior is contained within the object itself.
    // Expose behavior(methods) and RESTRICT direct access to data(fields).

    // double length; it's access modifier is by default protected and people can directly access these fields
    protected double length;
    protected double width;
    protected int sides = 4;

    // constructor appears after the fields but before the method

    // By default, in Java, a constructor is already there, you just can't see it.
    public Rectangle() {
        // Acts as a set-up. Sets up the initial state of the class.
        setLength(0);
        setWidth(0);
//        this.width = 0; // It is better to do the setter method than doing this.
    }

    // With a static class you basically just want to access the methods without having to set up an initial state.
    // You don't need or care about state.

    // THE ALL ARGS CONSTRUCTOR
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
