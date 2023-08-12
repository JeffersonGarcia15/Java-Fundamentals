package objects;
// Did not have to import the Rectangle class because this is in the same package(folder)
public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle roomDefaultConstructor = new Rectangle();
        roomDefaultConstructor.setLength(50);
        roomDefaultConstructor.setWidth(25);

        double areaOfRoom1 = roomDefaultConstructor.calculateArea();

        Rectangle roomAllArgs = new Rectangle(50, 25);
        double areaOfRoom2 =roomAllArgs.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("This is the total area: " + totalArea);
    }
}
