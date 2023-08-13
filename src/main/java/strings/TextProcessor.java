package strings;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
    }

    private static void countWords(String text) {
        String[] arrayOfStrings = text.split(" ");
        int numberOfWords = arrayOfStrings.length;

        String message = String.format("Your text contains %d words.", numberOfWords);
        System.out.println(message);

        for (String word : arrayOfStrings) {
            System.out.println(word);
        }
    }


}
