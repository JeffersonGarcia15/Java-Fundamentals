package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    // private static final int
    private static final int LENGTH = 6; // <- known as a constant, meaning it WON'T change.
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
//            int randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            int randomNumber;

            do {
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER); // first we do this
            } while(search(ticket, randomNumber)); // and then this. As long as this is a valid number the while will continue.
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        Arrays.sort(ticket); // Notice how we didn't have to do the new Arrays. This is all thanks to it having some static methods.
        for (int number : ticket) { // enhanced for loop. Kind of like a for in list in python or for of loop in js
            System.out.print(number + " | "); // no println because this one prints in a new line
        }
    }
}
