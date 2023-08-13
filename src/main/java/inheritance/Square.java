package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        // if sides and length are private
        // return getSides() * getLength();
        return sides * length;
    }
}
