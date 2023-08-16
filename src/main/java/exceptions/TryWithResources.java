package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        try (Scanner fileReader  = new Scanner(file)) { // only sub-classes of the autocloseable class can be here
            while (fileReader.hasNext()) {
                System.out.println("The number is: " + fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println(error.getMessage());
        } catch(Exception error) { // Exception is the parent of the above ones, so if I put this catch first
            // there is no possible way to get to the child exceptions.
            System.out.println(error.getMessage());
        }
    }
}
