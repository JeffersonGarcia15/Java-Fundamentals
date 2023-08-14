package data_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {
        CollectionsDemo set = new CollectionsDemo();
//        set.setDemo(); // I did this on purpose to practice. I could have done setDemo() if it was static.
        listDemo();
    }

    public void setDemo() {
        Set fruits = new HashSet(); // since Set is an interface I can't instantiate it. But, I can instantiate one of its implementing classes.
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        System.out.println(fruits);

        System.out.println(fruits.contains("lemon")); // true
        fruits.remove("lemon");
        System.out.println(fruits.contains("lemon")); // false

        System.out.println(fruits.size());

        Set moreFruits = Set.of("pear", "raisin", "cherry");

    }

    public static void listDemo() {
        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove("lemon");

        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("grape"));

        List moreFruits = List.of("cherry", "plum");

    }

}
