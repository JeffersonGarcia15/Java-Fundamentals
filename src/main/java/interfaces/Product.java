package interfaces;

/*
Interfaces: a stateless construct with abstract behaviors.
can't be instantiated
implemented by classes, extended by other interfaces(not classes)
implementing non-abstract class must implement all abstract methods.
Since they are stateless fields are final.
 */

public interface Product {

    String getName();
    void setName(String name);

    default double getPrice() { // now that this is default I HAVE to provide an implementation.
        return 50; // Make sure to set up an initial price. If we say 0, then when we call price everything is free.
    }
//    Leave it as empty body because well, we don't have state in an interface so how do we update this?
    default void setPrice(double price) {} // by default these methods are implicitly abstract, and public which means that in Book
//    we have an issue because we don't have these methods.
}
