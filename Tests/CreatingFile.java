import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFile {
    public static void creating() {
        try{
            File myFile = new File( "example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
    }
}
