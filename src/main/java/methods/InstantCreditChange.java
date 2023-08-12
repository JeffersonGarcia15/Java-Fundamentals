package methods;

import java.util.Scanner;

public class InstantCreditChange {

    // You can have Java infer the type by using var. Local variable type inference. It CANNOT be used as global.

    // static int requiredSalary = 25000; has to be static or in a static method it will throw an error
    // static Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean creditChangeDecision = isUserApproved(scanner);
        if (creditChangeDecision) {
            System.out.println("You were approved!");
        } else {
            System.out.println("Sorry, you were not approved.");
        }
        scanner.close();

    }
    private static int getUserSalary(Scanner scanner) {
        System.out.println("What is your yearly salary before taxes?");
//        Scanner scanner = new Scanner(System.in);
        int yearlySalary = scanner.nextInt();
//        scanner.close();

        return yearlySalary;
    }
    private static int getUserCredit(Scanner scanner) {
        System.out.println("What is your credit score?");
//        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();
//        System.out.println("THIS IS THE USER CREDIT " + creditScore);

//        scanner.close();

        return creditScore;
    }

    /**
     * isUserApproved is a method used to determine the eligibility of a user.
     *
     * @param scanner {@code Scanner a scanner used to read user input
     * @return {@code boolean} a boolean determining whether the user is approved or not.
     */
    private static boolean isUserApproved(Scanner scanner) {
        int userSalary = getUserSalary(scanner);
        int userCredit = getUserCredit(scanner);

        return userSalary > 25000 && userCredit > 700;
    }
}
