package interfaces;

public class Library {
    /*
    public class ElectronicBok implements Product, DigitalFile
    A methods signature consists of the name and the args and NOT the return type.
    Types of methods in interfaces: abstract, default and static
     */

    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Macbeth");
    }
}
