package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    List<String> veggies = List.of(
            "spinach",
            "cabbage",
            "peas",
            "green beans",
            "brussels sprouts",
            "carrots"
    );

    static List<String> staticVeggies = List.of(
            "spinach",
            "cabbage",
            "peas",
            "green beans",
            "brussels sprouts",
            "carrots"
    );

    public static void main(String[] args) {
        StreamOperations streamDemo = new StreamOperations();
//        streamDemo.anyMatchDemo();
//        allMatchesDemo();
//        filterDemo();
//        mapDemo();
//        reduceDemo();
//        intReduceDemo();
//        collectDemo();
        multiOperationDemo();
    }


    public void anyMatchDemo() {
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchesDemo() {
        boolean allMatches = staticVeggies.stream().allMatch(v -> v.contains("s"));
        System.out.println(allMatches);
    }

    public static void filterDemo() {
        staticVeggies.stream()
                .filter(v -> !v.contains("s"))
                .forEach(System.out::println);

    }

    public static void mapDemo() {
        Stream<String> myMap = staticVeggies.stream()
                .map(String::toUpperCase);
        myMap.forEach(v -> System.out.println(v));

    }

    public static void reduceDemo() {
        String result = staticVeggies.stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b);
        System.out.println(result);
    }

    public static void intReduceDemo() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        Stream<Integer> myNumberStream = numbers.stream();
//        int myReduceTotal = myNumberStream.reduce(0, (a, b) -> a + b);

        int myReduceTotal = myNumberStream.reduce(0, Integer::sum); // method reference
        System.out.println(myReduceTotal);
    }

    public static void collectDemo() {
        Stream<String> filteredResult = staticVeggies.stream().filter(v -> v.endsWith("s"));
//        List<String> myListFromStream = filteredResult.collect(Collectors.toList());
        List<String> myListFromStream = filteredResult.toList();
        myListFromStream.forEach(System.out::println);
    }

    public static void multiOperationDemo() {
        staticVeggies.stream()
                .sorted()
                .filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> v.charAt(0) + w))
                .forEach(System.out::println);
    }
}
