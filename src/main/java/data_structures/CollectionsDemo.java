package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        CollectionsDemo set = new CollectionsDemo();
        set.setDemo(); // I did this on purpose to practice. I could have done setDemo() if it was static.
//        listDemo();
//        queueDemo();
//        mapDemo();

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
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
//        fruitCalories.putIfAbsent("lemon", 17); // Will not override the one with 20.
        fruitCalories.remove("lemon");

        Set mapEntries = fruitCalories.entrySet();
        var i = mapEntries.iterator();

        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry)i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("banana"));
        System.out.println(fruitCalories.get("Something"));
        System.out.println("Contains orange? " + fruitCalories.containsKey("orange"));

        Map newFruits = Map.of(
                "apple", 95,
                "lemon", 20
        );
    }

}
