package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    private static String getUserName() {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        scanner.close();
        return userName;
    }

    private static void greetUser(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }
}
// This is known as Overloaded Methods. They share the same name but since they need to be uniquely identified
// the method types must be different or the amount of methods must be different.

//public class Month {
//       public int getMonth(String month) {
//           // ...
//       }
//
//       public String getMonth(int month) {
//           // ...
//       }
//       public int getMonth(String monthName) {
//           // ...
//       } This one won't compile because there is another method that accepts a String type as well!
//}
