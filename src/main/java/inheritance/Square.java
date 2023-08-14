package inheritance;

import objects.Rectangle;

// public sealed class Shape permits Rectangle, Circle
// public sealed(non-sealed or final are your options) class Rectangle extends Shape permits Square
// if non-sealed then the child classes don't have to specify sealed/non-sealed/final,
//  final means that the class can't have subclasses. It cannot be inherited from.
public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        // if sides and length are private
        // return getSides() * getLength();
        return sides * length;
    }

    public void print(String text) {
        System.out.println("I am a " + text);
    }
}
