package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
//    public static void main(String[] args) {
//        int totalHours = 40;
//
////        System.out.println("How many hours did you work: ");
//        Scanner scanner = new Scanner(System.in);
////        double startingHours = scanner.nextDouble();
//        double currentHours = 0;
//
//        while (currentHours <= totalHours) {
//            System.out.println("You can work up to " + (totalHours - currentHours));
//            System.out.println("How many hours did you work: ");
//            currentHours += scanner.nextDouble();
//        }
//        scanner.close();
//        System.out.println("You have exceeded the total number of allowed work hours before reaching overtime");
//    }

    public static void main(String[] args) {
        int totalHours = 40;
        int rate = 15;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double currentHours = scanner.nextDouble();

        while (currentHours > totalHours || currentHours < 0) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again!");
            currentHours = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Your gross pay is " + (rate * currentHours));
    }

}
