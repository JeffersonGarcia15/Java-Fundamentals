package objects;

import java.util.Scanner;

// Did not have to import the Rectangle class because this is in the same package(folder)
public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) { // this main method is static because everything we used before is static,
        // meaning that we didn't set up state or called a constructor.
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom(); // this is if I don't want to use static methods
        // Literally, I have to instantiate the class within itself just to call one of its methods.
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.println("This is the total area: " + totalArea);
    }

    public Rectangle getRoom() { // if we make this static then we don't have access to the global vars in this class.
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2) {
        return (room1.calculateArea() + room2.calculateArea());
    }
}
