package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Please enter your letter grade: ");

        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        scanner.close();

        // Enhanced switch statement
        switch (grade) {
            case 'A' -> System.out.println("Excellent job!");
            case 'B' -> System.out.println("Great job!");
            case 'C' -> System.out.println("Good job!");
            case 'D' -> System.out.println("You need to work a bit harder.");
            case 'F' -> System.out.println("Uh oh!");
            default -> System.out.println("Error. Invalid grade.");
        }

//        switch (grade) {
//            case 'A':
//                System.out.println("Excellent job!");
//                break; // Fallthrough it will continue until it finds a break
//            case 'B':
//                System.out.println("Great job!");
//                break;
//            case 'C':
//                System.out.println("Good job!");
//                break;
//            case 'D':
//                System.out.println("You need to work a bit harder.");
//                break;
//            case 'F':
//                System.out.println("Uh oh!");
//                break;
//            default:
//                System.out.println("Error. Invalid grade.");
//        }

    }
}
