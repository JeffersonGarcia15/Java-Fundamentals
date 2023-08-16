package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");
        try (
                Scanner fileReader  = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile); // These are closed in REVERSE order
        ) { // only subclasses of the autocloseable class can be here
            while (fileReader.hasNext()) {
//                System.out.println("The number is: " + fileReader.nextDouble());
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println(error.getMessage());
        } catch(Exception error) { // Exception is the parent of the above ones, so if I put this catch first
            // there is no possible way to get to the child exceptions.
            System.out.println(error.getMessage());
        }
    }
}
