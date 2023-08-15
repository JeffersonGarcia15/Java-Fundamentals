package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandler {

    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println("The number is: " + fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println(error.getMessage());
        } catch(Exception error) { // Exception is the parent of the above ones, so if I put this catch first
            // there is no possible way to get to the child exceptions.
            System.out.println(error.getMessage());
        }
//        try {
//            file.createNewFile();
//
//        } catch (IOException error) {
//            System.out.println(error.getMessage());
//        }
    }
}
