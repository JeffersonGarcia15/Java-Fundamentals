package strings;


public class TextProcessor {

    public static void main(String[] args) {
        //countWords("I love Java");
        reverseString("stop"); // "pots"
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

    private static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

    }


}
