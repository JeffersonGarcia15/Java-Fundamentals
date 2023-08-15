package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        File file = new File("resources/nonexistance.txt");
        try {
            file.createNewFile();

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
