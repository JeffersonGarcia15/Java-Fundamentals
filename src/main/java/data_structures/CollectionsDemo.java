package data_structures;

import java.util.*;
import java.util.function.Consumer;

public class CollectionsDemo {

    public static void main(String[] args) {
        CollectionsDemo set = new CollectionsDemo();
//        set.setDemo(); // I did this on purpose to practice. I could have done setDemo() if it was static.
//        listDemo();
//        queueDemo();
        mapDemo();

    }

    public void setDemo() {
        Set fruits = new HashSet(); // since Set is an interface I can't instantiate it. But, I can instantiate one of its implementing classes.
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        // ***************** ITERATORS **************
        Iterator i = fruits.iterator();
        do {
            System.out.println(i.next());
        } while (i.hasNext());
//        for (Object fruit : fruits) {
//            System.out.println(fruit);
//        }
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }

//        System.out.println(fruits);

//        System.out.println(fruits.contains("lemon")); // true
//        fruits.remove("lemon");
//        System.out.println(fruits.contains("lemon")); // false
//
//        System.out.println(fruits.size());
//
//        Set moreFruits = Set.of("pear", "raisin", "cherry");

    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//        fruits.remove("lemon");
//
//        System.out.println(fruits.get(1));
//        System.out.println(fruits.indexOf("grape"));
//
//        List moreFruits = List.of("cherry", "plum");

    }

    public static void queueDemo() {
//        Queue fruits = new LinkedList();
        Queue<String> fruits = new LinkedList();


        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        String removed = fruits.remove();

        System.out.println(fruits);
        System.out.println("removed " + removed);
        System.out.println("Peak " + fruits.peek());

    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<String, Integer>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
//        fruitCalories.putIfAbsent("lemon", 17); // Will not override the one with 20.

        for (Map.Entry calorieInfo : fruitCalories.entrySet()) {
            System.out.println(calorieInfo.getKey() + " : " + calorieInfo.getValue());

        }

//        fruitCalories.remove("lemon");
//
//        Set mapEntries = fruitCalories.entrySet();
//        var i = mapEntries.iterator();
//
//        while (i.hasNext()) {
//            Map.Entry entry = (Map.Entry)i.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
//
//        System.out.println(fruitCalories);
//        System.out.println(fruitCalories.get("banana"));
//        System.out.println(fruitCalories.get("Something"));
//        System.out.println("Contains orange? " + fruitCalories.containsKey("orange"));
//
//        Map newFruits = Map.of(
//                "apple", 95,
//                "lemon", 20
//        );
    }

    public static void functionalInterfaces() {
        List<String> countries = List.of("El Salvador", "United States of America", "Brazil", "France");

//        countries.forEach(System.out::println); // method reference
//        countries.forEach(c -> System.out.println(c)); // lambda expression

//        Consumer print = c -> System.out.println(c);
//        countries.forEach(print);

        /*
        @FunctionalInterface
public interface Consumer<T> {

        void accept(T t); Abstract method that accepts a single input argument and it returns void.
        }
         */
        Consumer print = c -> System.out.println(c); // Basically our lambda function becomes the body(implementation) of the void accept(T, t) method
        // so the lambda becomes the implementation of the interface's single abstract method which in this case is the accept method.

        print.accept("Hello, World!");
    }

}
