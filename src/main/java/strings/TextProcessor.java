package strings;


public class TextProcessor {

    public static void main(String[] args) {
        //countWords("I love Java");
        //reverseString("stop"); // "pots"
        addSpaces("HeyWorld!It'sMeJefferson");
        addSpaces("");
        addSpaces("helloEveryoneAndBye");

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
//    private static void addSpaces(String text) {
//        if (text.isEmpty()) {
//            System.out.println("Sorry, your string is empty!");
//            return;
//        }
//        StringBuilder str = new StringBuilder();
//        // Check if the first word is upper case and if it is .append it to str.
//        str.append(text.charAt(0)); // "H"
//
//        for (int i = 1; i < text.length(); i++) {
//            if (Character.isUpperCase(text.charAt(i))) {
//                str.append(" ");
//                str.append(text.charAt(i)); // "Hey W
//            } else {
//                str.append(text.charAt(i)); // "Hey | "Hey World!
//            }
//        }
//        System.out.print(str);
//    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " "); // World!It'sMeJefferson is shifted the first time we enter here by one unit to make space for the " "
                i++; // We want to do this because where we had an upper case we just inserted a white space.
                // So we increment i so that we go to where we would've gone if we didn't insert that white space there.
            }
        }
        System.out.println(modifiedText);
    }



}
